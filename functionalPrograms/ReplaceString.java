
/*
 * 
 *  Purpose:To replace a string from a given pattern.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018
 * 
 * */


package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;


public class ReplaceString {

	public static void main(String[] args) {
		
		System.out.println("Enter your name");
		// Function to take user input

		String name= Utility.inputString();
		
		/*
		 * @param inputString  contains given pattern
		 * */
		
		String inputString ="Hello <<UserName>>, How are you?";

		/* Function to replace string from given pattern 
		 * @param inputString contains pattern
		 * @param name contains desired string to replace 
		 * */
		String[] result=Utility.splitString(inputString, name);
		
		
		
		/* Function converts string array to string and storing in variable outcome
		 * @param string array
		 * */
		String outcome=Utility.convertToString(result);
		System.out.println(outcome);
		
	}
	
}
