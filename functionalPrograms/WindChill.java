package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class WindChill {

	public static void main(String[] args) {

		double temperature = 0;
		double speed = 0;
		System.out.println("Enter the value for temperature(less then 50 Fahrenheit)");
		temperature = Utility.inputDouble();
		System.out.println("Enter the value for wind speed(between 3 to 120)(in miles per hour)");
		speed = Utility.inputDouble();

		Utility.chillCalculation(temperature, speed);

	}
}
