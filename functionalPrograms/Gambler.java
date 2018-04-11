
/*
 * 
 *  Purpose:- To Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or 
 *  reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes.
 *   Run the experiment N times, averages the results, and prints them out.
.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   04-4-2018
 * 
 * */
package com.bridgeIt.functionalPrograms;

import com.bridgeIt.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		
		
		//Taking users input for stake,goal and times
		System.out.println("Enter stakes");
		int stake=Utility.inputInt();
		System.out.println("Enter goal");
		int goal=Utility.inputInt();
		System.out.println("Enter numbers of times");
		int times=Utility.inputInt();
		
		/* Function to simulate gambling through randomness
		 * @param stake money to with
		 * @param goal gambler's target to achieve 
		 * @param times for playing n numbers of times
		 * */
		Utility.gambling(stake, goal, times);
		
	}
	
}
