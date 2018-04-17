
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
		int a = Utility.inputInt();										

		System.out.println("Enter the value for final range ");
		int b = Utility.inputInt();										

		Utility.makeRange(a, b);

	}

}
