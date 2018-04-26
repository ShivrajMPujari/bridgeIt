/* 
 *  Purpose:Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used
 *  		 to order the performance of operations.
 *  		 Ensure parentheses must appear in a balanced fashion.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   19-4-2018
 * 
 * */
package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class BalancedParenthesis {

	public static void main(String[] args) {
		
		String equation="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3))";
		
		Utility.checkParentheses(equation);
	}
	
}
