/*
 * 
 *  Purpose:Take a command-line argument N and prints a table of the powers of 2 
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018
 * 
 * */


package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		
		String power=args[0];								//Given command line argument
		
		System.out.println("Power of 2 till raise to "+power);
		
		/* Function createTable create raise to power 2 table 
		 * @param power takes the number till which table is printed
		 * 
		 * */
		Utility.createTable(power);
		
	}

	
}

