
/*
 *  Purpose:i. Swap nibbles of binary number and find the new number.
			ii. Find the resultant number is the number is a power of 2.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   12-4-2018
 * 
 * */
package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class SwapNibbles {

	public static void main(String[] args) {
		
		System.out.println("Enter any integer number which will be conveted to binary ");
		int number=Utility.inputInt();				
		
		
		String str=Utility.increseLength(number); 
		
	
	    String s=Utility.swapNibble(str);
	    
	   
		int num=Utility.toInt(s);
		

		boolean result=Utility.findPowOfTwo(s);
		
		System.out.println(num+" is resultant number");
		System.out.println(num+" is power of 2 ? :- "+ result);
		
	}

}
