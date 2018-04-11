package com.bridgeIt.algorithmsPrograms;

import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class PrimeAnagram {

	public static void main(String[] args) {
		
		System.out.println("Enter the nth term:");
		int n=Utility.inputInt();
		int[] out;
		out=Utility.primeNumbers(n);
		Utility.display(out);
		
		for (int i = 0; i < out.length-1; i++) {
			for (int j = i+1; j < out.length; j++) {
				Utility.checkIntAnagaram(out[i], out[j]);
			}
			
		}
		
	}

}
