package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
	
		System.out.println("Enter the amount for changes");
		int amount=Utility.inputInt();
		
		Utility.vendingMachine(amount);
		
	}

}
