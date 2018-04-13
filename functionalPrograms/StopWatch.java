/*
 * 
 *  Purpose: Stopwatch Program for measuring the time 
 *  		that elapses between the start and end clicks
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   05-4-2018
 * 
 * */


package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		double start=0;
		double end=0;
		
		/*Using system class function to get current instance of time in millisecond  */
		 start = Utility.getTime();
		System.out.println(start);
		
		
		try {
			/*Using Thread class sleep method to consume some span of time in milliseconds */
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		/*Using system class function to get current instance of time in millisecond  */
		end = Utility.getTime();
		System.out.println(end);
		
		
		/*
		 * Function for calculating the elapsed time 
		 * @param start and stop which holds time value in milliseconds 
		 *   */
		double time=Utility.stopWatch(start, end);
		
		

	}

}
