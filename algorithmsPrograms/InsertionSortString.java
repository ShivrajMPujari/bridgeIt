/* 
 *  Purpose:Read in strings from standard input and prints them in sorted order.
			Uses insertion sort.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   09-4-2018
 * 
 * */

package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class InsertionSortString {

	public static void main(String[] args) {
		

		System.out.println("enter the strings ");
		String str=Utility.inputStringLong();
		System.out.println(str);
		String strArray[]=str.split("\\s");
		
	
		Utility.insertionSort(strArray);
		
		
	}

}
