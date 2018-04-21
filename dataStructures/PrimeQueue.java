/* 
 *  Purpose:Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Queue 
 *  		using the Linked List and Print the Anagrams from the Queue.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   19-4-2018
 * 
 * */
package com.bridgeIt.dataStructures;

import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class PrimeQueue {

	public static void main(String[] args) {

		
		System.out.println("Enter the nth term:");
		int num = Utility.inputInt();							
		
		int[] out = Utility.primeNumbers(num);	
		Integer[] anagrams=Utility.anagramArray(out);
		Integer[] primeanagrams=Utility.primeAnagramArray(anagrams);
		QueueLinkList queue= new QueueLinkList();
		for (int i = 0; i < primeanagrams.length; i++) {
			
			queue.enqueue(primeanagrams[i]);
		}
		queue.printQueue();
		
	}

}
