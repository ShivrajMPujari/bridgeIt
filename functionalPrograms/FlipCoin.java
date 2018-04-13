/*
 *  Purpose:To flip the coin n number of times and display percentage  of head and tails. 		
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018 
 * */

package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {

		System.out.println("Enter the number of flips");
		
		int num = Utility.inputInt();
		
		/* Function flip to take number of flip and generate head and tails percentage and
		 * displays percent of head and tails 
		 * @param num takes number of flips
		 * 
		 * */
		Utility.flip(num);

	}
}
