package model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor  
@NoArgsConstructor  
public class OrdersDict {
    @JsonProperty("Orders") 
	List<OrderDict> orders;
    
}
