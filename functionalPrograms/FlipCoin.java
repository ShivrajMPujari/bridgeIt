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

		Utility.flip(num);

	}
}
