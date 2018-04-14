
/*
 * 
 *  Purpose:Find roots of Quadratic equation a*x*x + b*x + c=0 .
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018
 * 
 * */
package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		
		System.out.println("For given equation a*x*x + b*x + c=0");
		System.out.println("Enter the value for a");
		int a=Utility.inputInt();
		System.out.println("Enter the value for b");
		int b=Utility.inputInt();
		System.out.println("Enter the value for c");
		int c=Utility.inputInt();
		
		 //delta calculation for equation a*x*x + b*x + c=0 storing in variable delta
		double delta= Utility. deltaCalculation(a, b, c);
		 System.out.println(delta);
		 
		/* Function to calculate the roots of the equation a*x*x + b*x + c=0
		 * @param delta ,a,b,c
		 * */
		Utility.calculateRoots(delta, a, b, c);
		 
		 
	}

}
