package com.bridgeIt.objectOriented;

import org.json.simple.JSONObject;

public class InventoryManager {
	
	Inventory inventory = new Inventory();
	JSONObject jsonobject = inventory.ObjectReading("InventoryDetails");
	
	public JSONObject inventoryFactory(String product){
	
	if(product.equalsIgnoreCase("rice")){
		
		JSONObject rice = (JSONObject) jsonobject.get("Rice");
		return rice;
	}
	else if(product.equalsIgnoreCase("wheat")){
		
		JSONObject wheat = (JSONObject) jsonobject.get("Wheat");
		return wheat;
	}
	else if(product.equalsIgnoreCase("pulses")){
		
		JSONObject pulses = (JSONObject) jsonobject.get("Pulses");
		return pulses;
	}
	
	
	return null;
		
	}
	
	
}
