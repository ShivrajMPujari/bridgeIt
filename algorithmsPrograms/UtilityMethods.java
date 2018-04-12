
/* 
 *  Purpose:Search and Sorted by using insertion sort,binary serach,bubble sort the list and
 *  		print the elapsed time for every methods .
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   12-4-2018
 * 
 * */

package com.bridgeIt.algorithmsPrograms;


import com.bridgeIt.utility.Utility;

public class UtilityMethods {

	public static void main(String[] args) {
		
		
		String [] st={"zon","bcon","ac","mk","za","ad"};  				//String array st
		String [] st1={"acon","bcon","con","dmk","eza","fad"};			//String sorted array st1
		Integer arr[]= {2,3,1,54,0,7,5};								//Integer array arr
		Integer arr1[]= {2,3,4,5,6,7,8};								//Integer sorted array arr1
		
		/* Functions  to sort and search the elements in array
		 * @param Array
		 * */
		Utility.insertionStopWatch(arr);            
		Utility.insertionStopWatch(st);
		Utility.binarySearchStopWatch(arr1, 0);
		Utility.binarySearchStopWatch(st1, "fad");
		Utility.bubbleSortStopWatch(st);
		Utility.bubbleSortStopWatch(arr);
	
	}

    
}
