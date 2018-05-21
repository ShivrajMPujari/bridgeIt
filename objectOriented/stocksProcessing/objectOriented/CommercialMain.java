package com.bridgeIt.objectOriented.stocksProcessing.objectOriented;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import com.bridgeIt.objectOriented.stocksProcessing.CommercialData;

/**purpose:-Commercial data processing tracking customers records
 * @author Shivraj Pujari
 * @date 21-5-18
 * @version 1.0
 *
 */
public class CommercialMain {

	public static void main(String[] args) {

		try {
			CommercialData.stockAccount();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

}
