
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
		
		
		int a=0;
		int b=0;
		int c=0;
		double delta= 0;
		
		
		//Taking users inputs for a,b, and c a*x*x + b*x + c=0 storing in variable a, b,c
		System.out.println("For given equation a*x*x + b*x + c=0");
		System.out.println("Enter the value for a");
		 a=Utility.inputInt();
		System.out.println("Enter the value for b");
		 b=Utility.inputInt();
		System.out.println("Enter the value for c");
		 c=Utility.inputInt();
		
		 //delta calculation for equation a*x*x + b*x + c=0 storing in variable delta
		 delta= Utility. deltaCalculation(a, b, c);
		 System.out.println(delta);
		 
		/* Function to calculate the roots of the equation a*x*x + b*x + c=0
		 * @param delta ,a,b,c
		 * */
		Utility.calculateRoots(delta, a, b, c);
		 
		 
	}

}
