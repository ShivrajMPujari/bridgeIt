package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class Harmonic {

	public static void main(String[] args) {
		double number = 0;

		System.out.println("enter the number to calculate the harmonic");
		number = Utility.inputDouble();
		Utility.harmonicCalculation(number);

	}
}
