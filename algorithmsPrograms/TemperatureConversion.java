/*
 *  Purpose:Given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   12-4-2018
 * 
 * */

package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Make a Choice:");
		System.out.println("Choose 1: Celsius to Fahrenit\nChoose 2: Fahrenit to Celsius");
		int choice=Utility.inputInt();
		System.out.println("Enter the temperature:");
		int temperature=Utility.inputInt();
		
		
		Utility.temperatureConvert(choice,temperature);
	}

}
