package underccity.albion.restservice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import constants.ItemList;
import model.OrdersDict;
import model.LocalizedRoot;
import model.OrderDict;


@SpringBootApplication
@EnableScheduling
public class RestServiceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(RestServiceApplication.class, args);
//		itemsParse();
		
	}

	private static void itemsParse()
			throws FileNotFoundException, IOException, StreamReadException, DatabindException, JsonProcessingException {
		ObjectMapper om = new ObjectMapper();
		FileInputStream fis = new FileInputStream("C:/Users/lenic/OneDrive/Рабочий стол/gs-rest-service-main/gs-rest-service-main/complete/src/main/resources/items.json");
		LocalizedRoot[] rootArr = om.readValue(fis.readAllBytes(), LocalizedRoot[].class);
		HashMap<String, String> localizedMap = new HashMap<>();
		for(LocalizedRoot rootEl : rootArr) {
			if(rootEl.getLocalizedNames() != null) {
				if(rootEl.getLocalizedNames().getRURU() != null) {
					localizedMap.put(rootEl.getUniqueName(), rootEl.getLocalizedNames().getRURU());
				}
			}
		}
//		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\lenic\\OneDrive\\Рабочий стол\\tst\file.json"));
		OrdersDict ordersDist = new OrdersDict();
		ArrayList<OrderDict> ordersList = new ArrayList<>();
		ordersDist.setOrders(ordersList);
		HashMap<String, OrderDict> dictMap = new HashMap<>();
		String cityList[] = {"Caerleon", "Thetford", "Lymhurst", "Bridgewatch", "Martlock", "Fort", "Brecilien"};
		for(ItemList.Item item : ItemList.Item.values()) {
			for(String city: cityList) {
				String name = item.name();
				name = name.substring(0, name.lastIndexOf("_"));
				
				String enhLevel = name.substring(name.lastIndexOf("_") + 1);
				name = name.substring(0, name.lastIndexOf("_"));
				
				String qLvl = name.substring(name.lastIndexOf("_") + 1);
				
				name = name.substring(0, name.lastIndexOf("_"));
				String id;
				if(name.substring(name.lastIndexOf("_") + 1).length() == 1) {
					name = (name.substring(0, name.lastIndexOf("_")));
				}
				id = name;
				
				String hash = id + "_" + enhLevel + "_" + qLvl + "_" + city;
				if(!dictMap.containsKey(hash)) {
					dictMap.put(hash, new OrderDict());
				}
				
				
				OrderDict orderDict = dictMap.get(hash);
				
				orderDict.setItemId(id);
				orderDict.setEnchantmentLevel(Integer.valueOf(enhLevel));
				orderDict.setQualityLevel(Integer.valueOf(qLvl));
				orderDict.setCity(city);
				orderDict.setMinPriceCellOffer(item.minOfferCellInTable());
				orderDict.setMaxPriceCellRequest(item.maxRqCellInTable());
				String desc = "REPLACE";
				if(localizedMap.containsKey(id)) {
					desc = localizedMap.get(id);
				}
				orderDict.setDescription(desc);
			}
		}
		
		for(Map.Entry<String, OrderDict> set : dictMap.entrySet()) {
			ordersList.add(set.getValue());
		}
		
		Collections.sort(ordersList, new Comparator<OrderDict>() {
	        @Override
	        public int compare(OrderDict fruit1, OrderDict fruit2)
	        {
	            return  fruit1.getItemId().compareTo(fruit2.getItemId());
	        }
		});
		
	    om.setSerializationInclusion(Include.NON_EMPTY);

		System.out.print(om.writeValueAsString(ordersDist));
	}

}
