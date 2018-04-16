
/*
 * 
 *  Purpose:To print Nth harmonic number
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018
 * 
 * */

package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class Harmonic {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to calculate the harmonic");
		
		double number = Utility.inputDouble();
		

		Utility.calculateHarmonic(number);
		
	}
}
