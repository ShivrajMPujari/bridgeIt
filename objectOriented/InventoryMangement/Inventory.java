package com.bridgeIt.objectOriented.InventoryMangement;

import java.util.HashMap;
import org.json.simple.JSONObject;
import com.bridgeIt.utility.Utility;

public class Inventory {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of products");
		int totalProducts=Utility.inputInt();
		HashMap<String,HashMap<String, Object>>productsMap= new HashMap<String,HashMap<String, Object>>();
		HashMap<String, Object> rice= new HashMap<>();
		HashMap<String, Object> wheat= new HashMap<>();
		HashMap<String, Object> pulse= new HashMap<>();
		System.out.println("select the contents:-");
		System.out.println("1.Rice 2.Wheat 3.Pulses");
		int select=Utility.inputInt();
		
			for (int i = 0; i <totalProducts ; i++) {
				switch(select){			
				case 1:{				
					System.out.println("Enter the types of Rice");
					int riceTypes=Utility.inputInt();
					for (int k = 0; k <riceTypes; k++) {
				
						HashMap<String, Object>map =new HashMap<>();
						System.out.println("Enter the name of the rice");
						String name=Utility.inputString();
						map.put("TypeName",name);
						System.out.println("Enter the price per kg");
						int pricePerKg=Utility.inputInt();
						map.put("pricePerKg",pricePerKg);
						System.out.println("Enter the weight in kg");
						int weight= Utility.inputInt();
						map.put("weight",weight);
						int value=pricePerKg*weight;
						System.out.println("Value of this product :-"+value);
						
						JSONObject jsonRice=new JSONObject(map);
						rice.put(name,jsonRice);

					}
					System.out.println(rice);
					productsMap.put("Rice", rice);
					System.out.println("Select 2.Wheat 3.Pulses");
					select=Utility.inputInt();
					
					break;
		
				}
				case 2:{
					
					System.out.println("Enter the types of Wheat");
					int wheatTypes=Utility.inputInt();
					for (int l = 0; l <wheatTypes;l++) {
				
						HashMap<String, Object>map =new HashMap<>();
						System.out.println("Enter the name of the Wheat");
						String name=Utility.inputString();
						map.put("TypeName",name);
						System.out.println("Enter the price per kg");
						int pricePerKg=Utility.inputInt();
						map.put("pricePerKg",pricePerKg);
						System.out.println("Enter the weight in kg");
						int weight= Utility.inputInt();
						int value=pricePerKg*weight;
						System.out.println("Value of this product :-"+value);
						map.put("weight",weight);
						JSONObject jsonWheat=new JSONObject(map);
						wheat.put(name,jsonWheat);

					}
					System.out.println(wheat);
					productsMap.put("Wheat", wheat);
					System.out.println("Select 1.Rice 3.Pulses");
					select=Utility.inputInt();
					break;
				}
				case 3:{
					
					System.out.println("Enter the types of Pulses");
					int pulsesTypes=Utility.inputInt();
					for (int z = 0; z <pulsesTypes;z++) {
				
						HashMap<String, Object>map =new HashMap<>();
						System.out.println("Enter the name of the Pulse");
						String name=Utility.inputString();
						map.put("TypeName",name);
						System.out.println("Enter the price per kg");
						int pricePerKg=Utility.inputInt();
						map.put("pricePerKg",pricePerKg);
						System.out.println("Enter the weight in kg");
						int weight= Utility.inputInt();
						int value=pricePerKg*weight;
						System.out.println("Value of this product :-"+value);
						map.put("weight",weight);
						JSONObject jsonPulses=new JSONObject(map);
						pulse.put(name,jsonPulses);
					}
					System.out.println(pulse);
					productsMap.put("Pulse", pulse);
					System.out.println("Select 1.Rice 2.Wheat");
					select=Utility.inputInt();
					break;
				}
				default:{
					System.out.println("Invalid selection");
					break;
				}	
				}
				}
			JSONObject productStore=new JSONObject(productsMap);
			System.out.println(productStore);
			
		}
		
	}

