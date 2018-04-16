/*
 *  Purpose:Prime Factorization of any number
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018
 * 
 * */

package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class PrimeFactors {

	public static void main(String[] args) {
		
		System.out.println("Enter any number to find prime factors of :-");
		long number=Utility.inputLong();
		

		Utility.factorizePrime(number);
		
		
	}
	
}
