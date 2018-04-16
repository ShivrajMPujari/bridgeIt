
/*
 * 
 *  Purpose:To convert any integer number to binary number.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   12-4-2018
 * 
 * */


package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class IntToBinary {

	public static void main(String[] args) {
		
		System.out.println("Enter the any integer number to convert into binary number");
		
		int num=Utility.inputInt();
		
		
		String binary=Utility.toBinary(num);
		System.out.println(binary);
	}

}
