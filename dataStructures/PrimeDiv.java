/* 
 *  Purpose:Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. Store the prime numbers in a 2D Array,
 *  		the first dimension represents the range 0-100, 100-200, and so on.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   19-4-2018
 * 
 * */
package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class PrimeDiv {

	public static void main(String[] args) {
		
		System.out.println("Enter the nth term:");
		int num = Utility.inputInt();							
		
		int[] out = Utility.primeNumbers(num);						
		Utility.arraySplit(out);
		
	}

}


