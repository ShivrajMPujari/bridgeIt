/* 
 *  Purpose:Print the calendar of the month using Queue 
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   19-4-2018
 * 
 * */
package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class CalenderQueue {

	public static void main(String[] args) {
		
		System.out.println("Enter the month:");
		int month=Utility.inputInt();
		System.out.println("Enter the year:");
		int year=Utility.inputInt();
		Utility.CalendarQueue(month,year);
	}
}
