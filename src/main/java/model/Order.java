package model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter  
@AllArgsConstructor  
@NoArgsConstructor  
public class Order {

	@JsonProperty("Id") 
	private Object id;
    @JsonProperty("ItemTypeId") 
    private String itemTypeId;
    @JsonProperty("ItemGroupTypeId") 
    private String itemGroupTypeId;
    @JsonProperty("LocationId") 
    private int locationId;
    @JsonProperty("QualityLevel") 
    private int qualityLevel;
    @JsonProperty("EnchantmentLevel") 
    private int enchantmentLevel;
    @JsonProperty("UnitPriceSilver") 
    private long unitPriceSilver;
    @JsonProperty("Amount") 
    private int amount;
    @JsonProperty("AuctionType") 
    private String auctionType;
    @JsonProperty("Expires") 
    private Date expires;
    
    public long getUnitPriceSilver() {
    	return unitPriceSilver/ 10000;
    }
    
    public String convertLocationId() {
    	String result = switch(this.locationId){
    		case (int) 3005->"Caerleon";
    		case (int) 0007->"Thetford";
    		case (int) 1002->"Lymhurst";
    		case (int) 2004->"Bridgewatch";
    		case (int) 3008->"Martlock";
    		case (int) 4002->"Fort";
    		case (int) 5003->"Brecilien";
    		
    		default -> throw new IllegalArgumentException("Unexpected value: " + this.locationId);
    	};
    	return result;
    }
    
    public String fullName() {
    	return this.getItemGroupTypeId() + "_" + 
    			this.getEnchantmentLevel() + "_" + this.getQualityLevel() + "_" + convertLocationId();
    }
}	
