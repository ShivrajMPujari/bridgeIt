package com.bridgeIt.objectOriented;

import org.json.simple.JSONObject;
import com.bridgeIt.utility.Utility;

public class InventoryManager {
	
	Utility utility= new Utility();
	JSONObject jsonobject = utility.ObjectReading("InventoryDetails");
	
	public JSONObject inventoryFactory(String product){
	
	if(product.equalsIgnoreCase("rice")){
		
		JSONObject rice = (JSONObject) jsonobject.get("Rice");
		return rice;
	}
	else if(product.equalsIgnoreCase("wheat")){
		
		JSONObject wheat = (JSONObject) jsonobject.get("Wheats");
		return wheat;
	}
	else if(product.equalsIgnoreCase("pulses")){
		
		JSONObject pulses = (JSONObject) jsonobject.get("Pulses");
		return pulses;
	}
	
	
	return null;
		
	}
	
	
}
