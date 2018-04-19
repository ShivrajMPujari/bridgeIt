package com.bridgeIt.dataStructures;

import com.bridgelabz.datastucture.Utility;

public class CalenderQueue {

	public static void main(String[] args) {
		
		System.out.println("Enter the month:");
		int month=Utility.inputInt();
		System.out.println("Enter the year:");
		int year=Utility.inputInt();
		Utility.CalendarQueue(month,year);
	}
}
