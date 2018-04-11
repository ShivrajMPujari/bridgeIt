package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class DayOfTheWeek {

	public static void main(String[] args) {
		System.out.println("Enter the date [M-D-Y]");
		System.out.println("Month:");
		int m=Utility.inputInt();
		System.out.println("Date:");
		int d=Utility.inputInt();
		System.out.println("Year:");
		int y=Utility.inputInt();
		int day=Utility.findingDay(m,d,y);
		Utility.printDay(day);
		//System.out.println(day);

	}

	
	}
	
	
	
	

