package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor  
@NoArgsConstructor  
@JsonIgnoreProperties(ignoreUnknown = true)

public class LocalizedRoot {
	@JsonProperty("LocalizationNameVariable") 
    public String localizationNameVariable;
    @JsonProperty("LocalizationDescriptionVariable") 
    public String localizationDescriptionVariable;
    @JsonProperty("LocalizedNames") 
    public LocalizedNames localizedNames;
    @JsonProperty("LocalizedDescriptions") 
    public LocalizedDescriptions localizedDescriptions;
    @JsonProperty("Index") 
    public String index;
    @JsonProperty("UniqueName") 
    public String uniqueName;
}
