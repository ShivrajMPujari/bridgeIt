package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		
		System.out.println("Enter the Principal amount:");
		double p=Utility.inputDouble();
		System.out.println("Enter the rate interest:");
		double r=Utility.inputDouble();
		System.out.println("Enter the years");
		int y=Utility.inputInt();
		Utility.monthlyPayment(p, r, y);
		
	}
	  
}
