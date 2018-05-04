package com.bridgeIt.objectOriented;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Inventory {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		JSONObject jsonobject = inventory.ObjectReading("InventoryDetails");
		JSONObject rice = (JSONObject) jsonobject.get("Rice");
		JSONObject wheat = (JSONObject) jsonobject.get("Wheats");
		JSONObject pulses = (JSONObject) jsonobject.get("Pulses");
		System.out.println(rice);
		System.out.println(wheat);
		System.out.println(pulses);

	}

	public JSONObject ObjectReading(String file) {

		JSONParser parser = new JSONParser();
		JSONObject jsonobject = null;
		try {
			FileReader read = new FileReader(
					"//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//" + file + ".json");
			Object object = parser.parse(read);
			jsonobject = (JSONObject) object;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		return jsonobject;

	}

}
