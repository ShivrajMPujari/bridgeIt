package com.bridgeIt.objectOriented;

import org.json.simple.JSONObject;

import com.bridgeIt.utility.Utility;
/**purpose:- Program to Create InventoryManager to manage the Inventory. 
 * The Inventory Manager will use InventoryFactory to create Inventory Object from JSON. 
 * The InventoryManager will call each Inventory Object in its list to calculate
 *  the Inventory Price and then call the Inventory Object to return the JSON String. 
 *  
 * @author Shivraj pujari
 * @version 1.0
 * @since   2-5-2018
 */
public class InventoryManagement {

	public static void main(String[] args) {
		
		InventoryManager manager= new InventoryManager();
		System.out.println("Enter the inventory product name");
		String product =Utility.inputString();
		JSONObject itemDetails=manager.inventoryFactory(product);
		System.out.println(itemDetails);
		System.out.println();
		String weight=(String) itemDetails.get("weight(kg)");
		int weights=Integer.parseInt(weight);
		String priceKg =(String) itemDetails.get("price/Kg");
		int priceInKg=Integer.parseInt(priceKg);
		System.out.println("inventory price:-");
		System.out.println(weights*priceInKg);
		
	}
	
}
