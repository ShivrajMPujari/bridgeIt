package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class UnorderedLIstFile {

	public static void main(String[] args) {
		
		String[] stringArray = Utility.readFile("unorderedList.txt");
		UnorderedList unorderedList  = new UnorderedList();
		for (int i = 0; i < stringArray.length; i++) {

			UnorderedList.add(stringArray[i]);
		}
		
	
		System.out.println("Enter the string");
		String act=Utility.inputString();
		UnorderedList.action(act);
		UnorderedList.printingList("unorderedList.txt");
		
	}

}
