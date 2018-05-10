package com.bridgeIt.objectOriented;

import org.json.simple.JSONObject;
import com.bridgeIt.utility.Utility;

/**purpose:-Create a JSON file having Inventory Details for Rice, Pulses and Wheats 
 * with properties name, weight, price per kg. 
 * @author Shivraj pujari
 * @version 1.0
 * @since   2-5-2018
 */
public class Inventory {

	public static void main(String[] args) {

		Utility utility= new Utility();
		JSONObject jsonobject=utility.ObjectReading("InventoryDetails");
		JSONObject rice = (JSONObject) jsonobject.get("Rice");
		JSONObject wheat = (JSONObject) jsonobject.get("Wheats");
		JSONObject pulses = (JSONObject) jsonobject.get("Pulses");
		System.out.println(rice);
		System.out.println(wheat);
		System.out.println(pulses);

	}

}
