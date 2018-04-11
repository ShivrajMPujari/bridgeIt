package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {

		System.out.println("Enter the number of flips");
		int num = Utility.inputInt();

		Utility.flip(num);

	}
}
