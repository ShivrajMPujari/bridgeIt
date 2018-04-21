
/* 
 *  Purpose:The Prime Number Program and store only the numbers in that range that are Anagrams
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   19-4-2018
 * 
 * */
package com.bridgeIt.dataStructures;

import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class Anagram2d {

	public static void main(String[] args) {
		
		System.out.println("Enter the nth term:");
		int num = Utility.inputInt();							
		
		int[] out = Utility.primeNumbers(num);	
		Integer[] anagrams=Utility.anagramArray(out);
		Integer[] primeanagrams=Utility.primeAnagramArray(anagrams);
		System.out.println(Arrays.toString(primeanagrams));
				
	}

}
