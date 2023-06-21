package model;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  
@Setter
@AllArgsConstructor  
@NoArgsConstructor  
public class OrderDict {

	@JsonProperty("ItemId") 
    private String itemId;
    @JsonProperty("QualityLevel") 
    private int qualityLevel;
    @JsonProperty("EnchantmentLevel") 
    private int enchantmentLevel;
    @JsonProperty("City") 
    private String city;
    @JsonProperty("Description") 
    private String description;
    
    @JsonProperty("MinPriceCellRequest") 
    private String minPriceCellRequest;
    
    @JsonProperty("MaxPriceCellRequest") 
    private String maxPriceCellRequest;
    
    
    @JsonProperty("MinPriceCellOffer") 
    private String minPriceCellOffer;
    
    @JsonProperty("MaxPriceCellOffer") 
    private String maxPriceCellOffer;
    
    public String fullName() { 
		return this.getItemId() + "_" + this.getEnchantmentLevel() + "_" + this.getQualityLevel() + "_"
		+ this.getCity();
    }
    
}	
