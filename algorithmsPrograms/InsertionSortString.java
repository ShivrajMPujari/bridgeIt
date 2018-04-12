package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class InsertionSortString {

	public static void main(String[] args) {
		

		System.out.println("enter the strings ");
		String st=Utility.inputStringLong();
		System.out.println(st);
		String st1[]=st.split("\\s");
		Utility.iSortString(st1);
		
		
	}

}
