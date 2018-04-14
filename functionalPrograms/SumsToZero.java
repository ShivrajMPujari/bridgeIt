/*
 *  Purpose:A program with cubic running time. Read in N integers and counts the number of triples
 *  		that sum to exactly 0.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018
 * 
 * */

package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class SumsToZero {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of array");
		
		int size = Utility.inputInt();								
		
		/* Function create an array and checks the distinct values equals to zero
		 * @param size used to take the size of an array
		 * */
		Utility.tripletChecking(size);

	}
	
}
