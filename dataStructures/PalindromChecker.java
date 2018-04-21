/* 
 *  Purpose:A palindrome is a string that reads the same forward and backward, for example, radar, toot, and madam.
 *  		We would like to construct an algorithm to input a string of characters and 
 *  		check whether it is a palindrome.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   19-4-2018
 * 
 * */
package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class PalindromChecker {

	public static void main(String[] args) {
		
		System.out.println("Enter the String:");
		String string=Utility.inputStringLong().toLowerCase().replaceAll(" ", "");
		Utility.isPalindromeChecker(string);
	}

}
