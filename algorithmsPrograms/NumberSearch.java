package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class NumberSearch {
	
	public static void main(String[] args) {
		
		int number =Integer.parseInt(args[0]);
		int[] array = new int[number];
		for (int i = 0; i < number; i++) 
			array[i] = i + 1;
		
		Utility.binarySearchInArray(array);
	}
}
