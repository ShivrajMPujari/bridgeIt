package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class FindNumber {

	public static void main(String[] args) {

		System.out.println("Choose a number range..a and b");
		System.out.println("Enter the value for a..");
		int a = Utility.inputInt();
		System.out.println("Enter the value for b..");
		int b = Utility.inputInt();

		int arr[] = Utility.createArray(a, b);

		Utility.binarySearchingUser(arr, 0, arr.length);

	}

}
