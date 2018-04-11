package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		
		System.out.println("Enter stakes");
		int stake=Utility.inputInt();
		System.out.println("Enter goal");
		int goal=Utility.inputInt();
		System.out.println("Enter numbers of times");
		int times=Utility.inputInt();
		
		Utility.gambling(stake, goal, times);
		
	}
	
}
