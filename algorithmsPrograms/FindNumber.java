
/* 
 *  Purpose: Take a number from a N and ask user to think between o to N-1 and
 *  		  ask user true/false if the number is between a high and low value.

 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   09-4-2018
 * 
 * */
package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class FindNumber {

	public static void main(String[] args) {

		System.out.println("Choose a number range..a and b");
		System.out.println("Enter the value for a..");
		int a = Utility.inputInt();								//user input for initial range
		System.out.println("Enter the value for b..");
		int b = Utility.inputInt();								//user input for final range

		
		/* Function creates an array between two ranges
		 * @param Number initial range and final range
		 * */
		int arr[] = Utility.createArray(a, b);

		Utility.binarySearchingUser(arr, 0, arr.length);

	}

}
