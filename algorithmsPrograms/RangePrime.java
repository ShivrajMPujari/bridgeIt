
/* 
 *  Purpose:Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   09-4-2018
 * 
 * */


package com.bridgeIt.algorithmsPrograms;

import java.util.ArrayList;

import com.bridgeIt.utility.Utility;

public class RangePrime {

	public static void main(String[] args) {

		System.out.println("Enter the value for intial range ");
		int a = Utility.inputInt();										//taking user input for initial range

		System.out.println("Enter the value for final range ");
		int b = Utility.inputInt();										//taking user input for final range

		
		/* Function takes two ranges and prints the prime numbers within that range
		 * @param initial and final range
		 * */
		Utility.makeRange(a, b);
/*	//	ArrayList al=Utility.adder();
		System.out.println(al.size());
		Utility.checkAnagram(al);*/

	}

}
