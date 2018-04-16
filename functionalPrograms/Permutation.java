
/*
 * 
 *  Purpose: Display Permutation of String.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018
 * 
 * */

package com.bridgeIt.functionalPrograms;


import com.bridgeIt.utility.Utility;

public class Permutation {


	  public static void main(String[] args)
	    {
		  
		  	System.out.println("Enter the desired string ");
	        String str = Utility.inputString();
	        int n = str.length();
	        
	        Utility.permute(str, 0, n-1);
	    }

}
