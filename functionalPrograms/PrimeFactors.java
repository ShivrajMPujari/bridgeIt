package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class PrimeFactors {

	public static void main(String[] args) {
		
		System.out.println("Enter any number to find prime factors of :-");
	//	int number=Utility.inputInt();
		
	//	Utility.factorization(number);
		long number=Utility.inputLong();
		Utility.factorizePrime(number);
		
	}
	
}
