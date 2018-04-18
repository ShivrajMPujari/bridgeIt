package com.bridgeIt.dataStructures;

import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class PrimeStack {

	public static void main(String[] args) {
		
		System.out.println("Enter the nth term:");
		int num = Utility.inputInt();							
		
		int[] out = Utility.primeNumbers(num);	
		Integer[] anagrams=Anagram2d.anagramArray(out);
		Integer[] primeanagrams=Anagram2d.primeAnagramArray(anagrams);
		System.out.println(Arrays.toString(primeanagrams));
		
		
		Stack store= new Stack();
	
		for (int i = 0; i < primeanagrams.length; i++) {
			
			store.push(primeanagrams[i]);
			
		}
		store.printStack();
		
	}
	
}
