
/*
 * 
 *  Purpose:To Check whether the given year is leap year or not.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018
 * 
 * */

package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class LeapYear {


	public static void main(String[] args) {
		

		System.out.println("Enter the any year");
		
		
		int year=Utility.inputInt();
		
		Utility.checkLeapYear(year);

	}
}
