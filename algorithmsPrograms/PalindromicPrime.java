package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class PalindromicPrime {

	public static void main(String[] args) {

		System.out.println("Enter the nth term:");
		int n = Utility.inputInt();
		int[] out;
		out = Utility.primeNumbers(n);
		Utility.display(out);

		for (int i = 0; i < out.length - 1; i++) {

			Utility.checkPalindromic(out[i]);

		}

	}

}
