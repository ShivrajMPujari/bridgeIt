
/* 
 *  Purpose:Take a range of 0 - 1000 Numbers and find the Prime numbers which are anagram.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   09-4-2018
 * 
 * */

package com.bridgeIt.algorithmsPrograms;

import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class PrimeAnagram {

	public static void main(String[] args) {
		
		System.out.println("Enter the nth term:");
		int num=Utility.inputInt();  								
		
	
		int[] out=Utility.primeNumbers(num);							
		Utility.display(out);
		
		for (int i = 0; i < out.length-1; i++) {
			for (int j = i+1; j < out.length; j++) {
				
			
				Utility.checkIntAnagaram(out[i], out[j]);
			}
			
		}
		
	}

}
