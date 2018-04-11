/*
 * 
 *  Purpose:Check whether the two strings are anagram or not.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   07-4-2018
 * 
 * */

package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class Anagram {

	public static void main(String[] args) {

		String s1 = null;
		String s2 = null;

		//Taking user input storing in String s1
		System.out.println("Enter String1");
		s1 = Utility.inputString();
		
		//Taking user input storing in String s2
		System.out.println("Enter String2");
		s2 = Utility.inputString();
		
		/* Function to check two Strings are anagram or not
		 * @param string s1 and s2 
		 * */
		Utility.detectAnagram(s1, s2);

	}

}
