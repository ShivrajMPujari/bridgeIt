/* 
 *  Purpose:-Reads in integers prints them in sorted order using Bubble Sort
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   09-4-2018
 * 
 * */
package com.bridgeIt.algorithmsPrograms;

import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class IntegersSort {

	public static void main(String[] args) {
	
		System.out.println("Enter the integer list");
		String st=Utility.inputStringLong();
		 String[] s=st.split("\\s");
		
		Integer [] integer=Utility.stringToInt(s);
		
		 Utility.bubbleSort(integer);
		 System.out.println(Arrays.toString(integer));
		 
			}
}
