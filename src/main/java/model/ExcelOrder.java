package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

@Getter
@Setter
@AllArgsConstructor  
@NoArgsConstructor  
public class ExcelOrder {

    @JsonProperty("ItemId") 
    private String itemId;
    @JsonProperty("QualityLevel") 
    private int qualityLevel;
    @JsonProperty("EnchantmentLevel") 
    private int enchantmentLevel;
    @JsonProperty("City") 
    private String city;
    @JsonProperty("MinPriceRequest") 
    private long minPriceRequest;
    @JsonProperty("MaxPriceRequest") 
    private long maxPriceRequest;
    
    @JsonProperty("MinPriceOffer") 
    private long minPriceOffer;
    @JsonProperty("MaxPriceOffer") 
    private long maxPriceOffer;
    
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int count;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private double allSum;

    @Setter(AccessLevel.NONE)
    private String fullName;
    
    public ExcelOrder(Order order) {
    	itemId = order.getItemGroupTypeId();
    	qualityLevel = order.getQualityLevel();
    	enchantmentLevel = order.getEnchantmentLevel();
    	city = order.convertLocationId();
    }
    
    public void addCount(int count) {
    	this.count += count;
    }
    
    public void addAllSum(long sum) {
    	this.allSum += sum;
    }
    
    
    public String getFullName() {
    	return this.getItemId() + "_" + this.getEnchantmentLevel() + "_" + this.getQualityLevel() + "_"
    			+ this.getCity();
    }
}	
