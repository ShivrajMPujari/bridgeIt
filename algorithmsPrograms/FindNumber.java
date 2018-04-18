
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
						
		int range = Integer.parseInt(args[0]);							

		int arr[] = Utility.createArray( range);

		Utility.binarySearchingUser(arr, 0, arr.length);

	}

}
