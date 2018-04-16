/* 
 *  Purpose:Takes a date as input and prints the day of the week that date falls on.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   09-4-2018
 * 
 * */
package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class DayOfTheWeek {

	public static void main(String[] args) {
		System.out.println("The date [M-D-Y]");
		
		System.out.println("Month: "+args[0]);				//taking command line argument
		int m=Integer.parseInt(args[0]);					// converting to int storing in variable
		
		System.out.println("Date: "+args[1]);				//taking command line argument
		int d=Integer.parseInt(args[1]);					// converting to int storing in variable
		
		System.out.println("Year: "+args[2]);				//taking command line argument
		int y=Integer.parseInt(args[2]);					// converting to int storing in variable
		
	
		int day=Utility.findingDay(m,d,y);
		
		
		Utility.printDay(day);

	}

	
	}
	
	
	
	

