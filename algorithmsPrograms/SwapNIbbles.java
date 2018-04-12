
/*
 * 
 *  Purpose:i. Swap nibbles of binary number and find the new number.
			ii. Find the resultant number is the number is a power of 2.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   12-4-2018
 * 
 * */
package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class SwapNIbbles {

	public static void main(String[] args) {
		
		System.out.println("Enter any integer number which will be conveted to binary ");
		int number=Utility.inputInt();				//taking users input
		
		/* Function will take integer number and convert it into binary 8-bit 
		 * @param number any integer number
		 * */
		String str=Utility.increseLength(number);  
		//System.out.println(str);
		
		/* Function will swap nibbles of 8--bit binary number
		 * @param String of binary number 
		 * */
	    String s=Utility.swapNibble(str);
	   // System.out.println(s);
	    
	    /* Function converts the binary number into integer
		 * @param String of binary number 
		 * */
		int num=Utility.toInt(s);
		
		/* Function to find the binary number is power of two or not
		 * @param String of binary number 
		 * */
		boolean result=Utility.findPowOfTwo(s);
		
		System.out.println(num+" is resultant number");
		System.out.println(num+" is power of 2 ? :- "+ result);
		
	}

}
