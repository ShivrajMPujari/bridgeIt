package com.bridgeIt.objectOriented;

import org.json.simple.JSONObject;

import com.bridgeIt.utility.Utility;

public class InventoryManagement {

	public static void main(String[] args) {
		
		InventoryManager manager= new InventoryManager();
		System.out.println("Enter the inventory product name");
		String product =Utility.inputString();
		JSONObject itemDetails=manager.inventoryFactory(product);
		System.out.println(itemDetails);
	}
	
}
