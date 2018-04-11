
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
		String name= Utility.inputString();
	//	System.out.println(name);
		String inputString ="Hello <<UserName>>, How are you?";
	//	String result =Utility.replace(name,mInputString );
		String[] result=Utility.splitString(inputString, name);
		
	//	System.out.println(Arrays.toString(result));
		String outcome=Utility.convertToString(result);
		System.out.println(outcome);
		
	}
	
}
