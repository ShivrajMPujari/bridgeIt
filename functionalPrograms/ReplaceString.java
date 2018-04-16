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
		String name = Utility.inputString(); 
		String inputString = "Hello <<UserName>>, How are you?";
		inputString= Utility.replace(name, inputString);
		System.out.println(inputString);

	}

}
