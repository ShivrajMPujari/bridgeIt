
/* 
 *  Purpose:Take a range of 0 - 1000 Numbers and find the Prime numbers which are palindrome.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   09-4-2018
 * 
 * */

package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class PalindromicPrime {

	public static void main(String[] args) {

		System.out.println("Enter the nth term:");
		int n = Utility.inputInt();							//taking user input for nth term and storing in variable n
		
		/* Function finds the prime numbers and store the numbers in an array
		 * @param number takes the range 
		 * */
		int[] out = Utility.primeNumbers(n);				
		Utility.display(out);								//prints the contents in an array of prime numbers

		for (int i = 0; i < out.length - 1; i++) {
			
			/* Function checks the number is palindrome or not
			 * @param prime numbers from an array
			 * */
			Utility.checkPalindromic(out[i]);

		}

	}

}
