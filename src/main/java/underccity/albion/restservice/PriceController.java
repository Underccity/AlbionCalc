package underccity.albion.restservice;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import google.SheetsUtil;
import model.ExcelOrder;
import model.Order;
import model.OrderDict;
import model.Orders;
import model.OrdersDict;

@RestController
public class PriceController {

	private static Logger logger = LoggerFactory.getLogger(PriceController.class);
    private static ObjectMapper mapper = new ObjectMapper();
    private static HashMap<String, OrderDict> orderDict = filldDict(); 
	private static final String ORDER_DICT_FILE_PATH = "/orderDict.json";

	@PostMapping(path = "/marketorders.ingest", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getPrices(HttpEntity<String> httpEntity) throws Exception {
		ObjectMapper om = new ObjectMapper();
		Orders orders = om.readValue(httpEntity.getBody(), Orders.class);
		logger.info(mapper.writeValueAsString(orders));
		List<Order> orderList = orders.getOrders();
		HashMap<String,ExcelOrder> excelOrderMap = new HashMap<>();

		for (Order order : orderList) {
			calculatePrices(order, excelOrderMap);
		}
		updatePrices(excelOrderMap);
		return null;
	}

	
	private static HashMap<String, OrderDict> filldDict(){
		logger.info("Start fillDict");
		
		Resource resource = new ClassPathResource(ORDER_DICT_FILE_PATH);
		HashMap<String, OrderDict> dict = new HashMap<>();
			try {
			InputStream in = resource.getInputStream();
			if (in == null) {
				throw new FileNotFoundException("Resource not found: " + ORDER_DICT_FILE_PATH);
			}
			
			
			OrdersDict dictFromFile = mapper.readValue(in.readAllBytes(), OrdersDict.class);
			
			for(OrderDict dictItem : dictFromFile.getOrders()) {
				dict.put(dictItem.fullName(), dictItem);
			}
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}
		
		return dict;
	}
	private void updatePrices(HashMap<String, ExcelOrder> excelOrderMap) throws Exception {
		
		for (Map.Entry<String, ExcelOrder> set :excelOrderMap.entrySet()) {
			
			SheetsUtil.sendToScheduledUpdate(orderDict.get(set.getValue().getFullName()).getMaxPriceCellRequest() , 
					String.valueOf(set.getValue().getMaxPriceRequest()));
			SheetsUtil.sendToScheduledUpdate(orderDict.get(set.getValue().getFullName()).getMinPriceCellRequest() , 
					String.valueOf(set.getValue().getMinPriceRequest()));
			
			SheetsUtil.sendToScheduledUpdate(orderDict.get(set.getValue().getFullName()).getMaxPriceCellOffer() , 
					String.valueOf(set.getValue().getMaxPriceOffer()));
			SheetsUtil.sendToScheduledUpdate(orderDict.get(set.getValue().getFullName()).getMinPriceCellOffer() , 
					String.valueOf(set.getValue().getMinPriceOffer()));
			
		}
		
	}

	private void calculatePrices(Order order, HashMap<String, ExcelOrder> excelOrderMap) throws JsonProcessingException {
		String orderName = order.fullName();
		logger.info(orderName);
		
		if(!orderDict.containsKey(orderName)) {
			return;
		}
		
		if(excelOrderMap.get(orderName) == null) {
			excelOrderMap.put(orderName, new ExcelOrder(order));
		}
		ExcelOrder excelOrder = excelOrderMap.get(orderName);
		
		if("request".equals(order.getAuctionType())){
			if(excelOrder.getMaxPriceRequest() < order.getUnitPriceSilver() ||
					excelOrder.getMaxPriceRequest() == 0 && order.getUnitPriceSilver() > 0) {
				excelOrder.setMaxPriceRequest(order.getUnitPriceSilver());
			}
			if(excelOrder.getMinPriceRequest() > order.getUnitPriceSilver() || 
					excelOrder.getMinPriceRequest() == 0 && order.getUnitPriceSilver() > 0) {
				excelOrder.setMinPriceRequest(order.getUnitPriceSilver());
			}
		}
		
		if("offer".equals(order.getAuctionType())){
			if(excelOrder.getMaxPriceOffer() < order.getUnitPriceSilver() ||
					excelOrder.getMaxPriceOffer() == 0 && order.getUnitPriceSilver() > 0) {
				excelOrder.setMaxPriceOffer(order.getUnitPriceSilver());
			}
			if(excelOrder.getMinPriceOffer() > order.getUnitPriceSilver() ||
					excelOrder.getMinPriceOffer() == 0 && order.getUnitPriceSilver() > 0) {
				excelOrder.setMinPriceOffer(order.getUnitPriceSilver());
			}
		}
		
		
		excelOrder.addCount(order.getAmount());
		excelOrder.addAllSum(order.getUnitPriceSilver());
		
		logger.info(mapper.writeValueAsString(excelOrder));

		
	}
}
