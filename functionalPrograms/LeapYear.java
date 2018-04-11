
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
		
		String year=null;
		
		System.out.println("Enter the any year");
		
		//taking users input
		year=Utility.inputString();
		
		/* Function for checking whether given year is leap year or not 
		 *
		 * @param year takes any year 
		 * */
		Utility.checkLeapYear(year);
		
	}
}
