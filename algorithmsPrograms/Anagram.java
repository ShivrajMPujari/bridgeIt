package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class Anagram {

	public static void main(String[] args) {

		String s1 = null;
		String s2 = null;

		System.out.println("Enter String1");
		s1 = Utility.inputString();

		System.out.println("Enter String2");
		s2 = Utility.inputString();

		Utility.detectAnagram(s1, s2);

	}

}
