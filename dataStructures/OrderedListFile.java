package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class OrderedListFile {

	public static void main(String[] args) {
		
		OrderedLinkedList ol= new OrderedLinkedList<>();	 
		 String [] s=Utility.readFile("OrderedListIn.txt");
		Integer[] in= new Integer[s.length];
		
			  for (int i = 0; i < s.length; i++) {
				  
				   in[i]=Integer.valueOf(s[i]);
				   ol.add(in[i]);
			}
			  ol.action(32);
			  ol.printList();
			  ol.printer("OrderedListOut.txt");
		
	}
}
