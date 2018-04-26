package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class OrderedListFile {

	public static void main(String[] args) {
		
		OrderedLinkedList orderedLinkedList= new OrderedLinkedList<>();	 
		 String [] stringArray=Utility.readFile("OrderedListIn.txt");
		Integer[] integerArray= new Integer[stringArray.length];
		
			  for (int i = 0; i < stringArray.length; i++) {
				  
				  integerArray[i]=Integer.valueOf(stringArray[i]);
				   orderedLinkedList.add(integerArray[i]);
			}
			  orderedLinkedList.action(32);
			  orderedLinkedList.printingList("OrderedListIn.txt");
		
	}
}
