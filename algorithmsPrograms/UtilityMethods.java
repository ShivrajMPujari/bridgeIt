
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

		String[] st = { "zon", "bcon", "ac", "mk", "za", "ad" }; 		//String array								
		String[] st1 = { "acon", "bcon", "con", "dmk", "eza", "fad" }; 	//String sorted array
		Integer arr[] = { 2, 3, 1, 54, 0, 7, 5 };						 // Integer array array
		Integer arr1[] = { 2, 3, 4, 5, 6, 7, 8 }; 						// Integer sorted array arr1

		Double resultA = Utility.insertionStopWatch(arr);
		Double resultB = Utility.insertionStopWatch(st);
		Double resultC = Utility.binarySearchStopWatch(arr1, 0);
		Double resultD = Utility.binarySearchStopWatch(st1, "fad");
		Double resultE = Utility.bubbleSortStopWatch(st);
		Double resultF = Utility.bubbleSortStopWatch(arr);

		Utility.TMAP.put(resultA, "InsertionSort integer"); 		//using put method of treemap to add in collection
		Utility.TMAP.put(resultB, "InsertionSort String");
		Utility.TMAP.put(resultC, "BinarySearch integer");
		Utility.TMAP.put(resultD, "BinarySearch String");
		Utility.TMAP.put(resultE, "BubbleSort String");
		Utility.TMAP.put(resultF, "BubbleSort integer");

		Utility.sortbykey();

	}

}
