/* 
 *  Purpose:Take the month and year as command-line arguments and prints the Calendar of the month. 
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   19-4-2018
 * 
 * */
package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class Calender {
	
	    public static void main(String[] args) {
	        int month = Integer.parseInt(args[0]);   
	        int year = Integer.parseInt(args[1]);     
	         Utility.printCalender(month, year);
	    }
	    

}
