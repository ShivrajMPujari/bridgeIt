package com.bridgeIt.objectOriented;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Inventory {

	public static void main(String[] args) {
		
		JSONParser parser=new JSONParser();
		
		try {
			FileReader read= new FileReader("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//InventoryDetails.json");
			Object obj=	parser.parse(read);
			JSONObject jobj=(JSONObject)obj;
			JSONObject wheats=(JSONObject)jobj.get("Wheats");
			JSONObject rice=(JSONObject)jobj.get("Rice");
			JSONObject pulse=(JSONObject)jobj.get("Pulses");
		
			String wName=(String)wheats.get("name");
			String wPrice=(String)wheats.get("price");
			String wWeight=(String)wheats.get("weight");
			
			System.out.println(wheats);
			System.out.println(rice);
			System.out.println(pulse);
		} catch (IOException | ParseException e) {

			e.printStackTrace();
		}
		
		
		
	}

}
