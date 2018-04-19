
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
		int num = Utility.inputInt();				
		
		int[] out = Utility.primeNumbers(num);				
		Utility.display(out);	
		Utility.primePalindrome(out);
	}
}
