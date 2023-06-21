package google;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.auth.oauth2.Credential;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.BatchUpdateValuesRequest;
import com.google.api.services.sheets.v4.model.BatchUpdateValuesResponse;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SheetsUtil {
	
    static Logger logger = LoggerFactory.getLogger(SheetsUtil.class);
    static ObjectMapper mapper = new ObjectMapper();
	
	private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
	private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
	private static final String TOKENS_DIRECTORY_PATH = "tokens";
	private static final String spreadsheetId = "1GOb4POdjxLyM2s3Cco47kulDQbZbTqEH4MbOuwRlubY";
	private static final HashMap<String, String> cacheMap= new HashMap<String, String>();
	/**
	 * Global instance of the scopes required by this quickstart. If modifying these
	 * scopes, delete your previously saved tokens/ folder.
	 */
	private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS);
	private static final String CREDENTIALS_FILE_PATH = "/credentials.json";

	
	static {
//		cacheMap.put("Лист6!A10;Лист7!A10", "L1");
//		cacheMap.put("Лист3!L2", "L2");
//		cacheMap.put("Лист3!L3", "L3");
//		cacheMap.put("Лист3!L4", "L4");
//		cacheMap.put("Лист3!L5", "L5");
	}
	/**
	 * Creates an authorized Credential object.
	 *
	 * @param HTTP_TRANSPORT The network HTTP Transport.
	 * @return An authorized Credential object.
	 * @throws Exception
	 */
	private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws Exception {
		// Load client secrets.
		Resource resource = new ClassPathResource(CREDENTIALS_FILE_PATH);
		InputStream in = resource.getInputStream();
		if (in == null) {
			throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
		}
		GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

		// Build flow and trigger user authorization request.
		GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY,
				clientSecrets, SCOPES)
				.setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
				.setAccessType("offline").build();
		flow.getRequestInitializer();
		LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
		return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
	}

	public static void sendBatchToSheet() throws Exception{
		logger.info("Entering sendBatchToSheet");
		
		if(cacheMap.isEmpty()) {
			logger.info("Map is empty. Nothing for update");
			return;
		}
		final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
		HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
			
			@Override
			public void initialize(HttpRequest request) throws IOException {
				request.setConnectTimeout(2*60000);
				
			}
		});
	    Sheets service =
	        new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
	            .setApplicationName(APPLICATION_NAME)
	            .build();
	    
		List<ValueRange> valueList = new ArrayList<>();

	    for (Map.Entry<String, String> set :cacheMap.entrySet()) {
	    	List<List<Object>> cellValue = Arrays.asList(Arrays.asList(set.getValue()));
	    	ValueRange batchValue = new ValueRange().setRange(set.getKey()).setValues(cellValue);
		    valueList.add(batchValue);
	    }
	    
	    cacheMap.clear();
	    
	    BatchUpdateValuesRequest batchRq = new BatchUpdateValuesRequest();
	    batchRq.setValueInputOption("USER_ENTERED");
	    batchRq.setData(valueList);
	    
	    BatchUpdateValuesResponse  response = service.spreadsheets().values()
		        .batchUpdate(spreadsheetId, batchRq).execute();
	    System.out.println(response);
	}
	
	
	public static void sendToScheduledUpdate(String range, String value) {
		if(range == null || "".equals(range) || "0".equals(value)) {
			return;
		}
		String[] rangeSplit;
		if(range.contains(";")) {
			rangeSplit = range.split(";");
			for(String rangeElement: rangeSplit) {
				cacheMap.put(rangeElement, value);
			}
			return;
		}
		logger.info("update cache map. range:{} value: {} ", range, value);
		cacheMap.put(range, value);
	}
	
}