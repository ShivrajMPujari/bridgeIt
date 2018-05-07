package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class OrderedListFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		OrderedLinkedList<Integer> orderedLinkedList= new OrderedLinkedList<Integer>();	 
		 String [] stringArray=Utility.readFile("OrderedListIn.txt");
		Integer[] integerArray= new Integer[stringArray.length];
		
			  for (int i = 0; i < stringArray.length; i++) {
				  
				  integerArray[i]=Integer.valueOf(stringArray[i]);
				   orderedLinkedList.add(integerArray[i]);
			}
			  orderedLinkedList.action(99);
			  orderedLinkedList.printingList("OrderedListIn.txt");
		
	}
}
