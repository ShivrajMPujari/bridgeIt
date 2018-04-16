
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
		int num = Utility.inputInt();							//taking user input for nth term and storing in variable n
		
		
		int[] out = Utility.primeNumbers(num);				
		Utility.display(out);								

		for (int i = 0; i < out.length - 1; i++) {
			
		
			Utility.checkPalindromic(out[i]);

		}

	}

}
