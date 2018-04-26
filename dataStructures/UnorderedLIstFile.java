package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class UnorderedLIstFile {

	public static void main(String[] args) {
		
		String[] stringArray = Utility.readFile("unorderedList.txt");
		UnorderedList unorderedList  = new UnorderedList();
		for (int i = 0; i < stringArray.length; i++) {

			UnorderedList.add(stringArray[i]);
		}
		
		UnorderedList.action("raj");
		UnorderedList.action("jay");
		UnorderedList.action("jay");
		UnorderedList.printingList("unorderedList.txt");
		
	}

}
