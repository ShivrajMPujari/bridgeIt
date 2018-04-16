/*
 *  Purpose:Take two double command-line arguments t and v and prints the wind chill.  .
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018
 * 
 * */

package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class WindChill {

	public static void main(String[] args) {

		
		String temperature = args[0];						//using command line argument
		System.out.println("Entered value for temperature(less then 50 Fahrenheit) "+temperature);
		
		String speed =args[1];								//using command line argument
		System.out.println("Entered value for wind speed(between 3 to 120)(in miles per hour) "+speed);
		
		
		Utility.chillCalculation(temperature, speed);

	}
}
