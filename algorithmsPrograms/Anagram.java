/* 
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

		String string1 = null;
		String string2 = null;

		System.out.println("Enter String1");
		string1 = Utility.inputStringLong();
		
		System.out.println("Enter String2");
		string2 = Utility.inputStringLong();
		
		 string1=string1.replace(" ", "");
		 string2=string2.replace(" ","");
		Utility.detectAnagram(string1, string2);

	}

}
