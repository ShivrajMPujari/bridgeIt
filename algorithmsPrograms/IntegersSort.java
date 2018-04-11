package com.bridgeIt.algorithmsPrograms;

import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class IntegersSort {

	public static void main(String[] args) {
	
		System.out.println("Enter the integer list");
		String st=Utility.inputStringLong();
		 String[] s=st.split("\\s");
		
		int[] integer=Utility.stringTOInt(s);
		 Utility.binarySortInt(integer);
		 System.out.println(Arrays.toString(integer));
		 
		
			}

}
