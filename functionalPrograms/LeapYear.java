package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class LeapYear {


	public static void main(String[] args) {
		
		String year=null;
		
		System.out.println("Enter the any year");
		year=Utility.inputString();
		Utility.checkLeapYear(year);
		
	}
}
