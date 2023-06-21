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
public class LocalizedNames {
	@JsonProperty("EN-US") 
    public String eNUS;
    @JsonProperty("DE-DE") 
    public String dEDE;
    @JsonProperty("FR-FR") 
    public String fRFR;
    @JsonProperty("RU-RU") 
    public String rURU;
    @JsonProperty("PLPL") 
    public String pLPL;
    @JsonProperty("ES-ES") 
    public String eSES;
    @JsonProperty("PT-BR") 
    public String pTBR;
    @JsonProperty("IT-IT") 
    public String iTIT;
    @JsonProperty("ZH-CN") 
    public String zHCN;
    @JsonProperty("KO-KR") 
    public String kOKR;
    @JsonProperty("JA-JP") 
    public String jAJP;
    @JsonProperty("ZH-TW") 
    public String zHTW;
    @JsonProperty("ID-ID") 
    public String iDID;
}
