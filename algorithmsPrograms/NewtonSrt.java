
/*
 * 
 *  Purpose:compute the square root of a nonnegative number c given in the input using Newton's method.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   12-4-2018
 * 
 * */

package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class NewtonSrt {

	public static void main(String[] args) {

		System.out.println("enter the number to find squareroot");
		int c = Utility.inputInt();

		double e = Math.E;

		int result = Utility.sqrt(e, c);
		System.out.println("Square root is"+result);

	}

}
