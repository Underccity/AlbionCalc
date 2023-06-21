package model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter  
@AllArgsConstructor  
@NoArgsConstructor  
public class Orders {
    @JsonProperty("Orders") 
	List<Order> orders;
}
