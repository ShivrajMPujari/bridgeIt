
/*
 * 
 *  Purpose:To replace a string from a given pattern.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   05-4-2018
 * 
 * */
package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		
		//taking command line arguments
		String x1=args[0];
		String y1=args[1];
		
		
		/* Function calculating the euclidean distance from origin
		 * @param euclidean distance at desired point along x-axis
		 *  @param euclidean distance at desired point along y-axis
		 * */
		Utility.calculateDistance(x1, y1);
	}

}
