package com.bridgeIt.objectOriented.commercialDataProcessing;

public class Node<Object> {

	Object data;							//data in a node
		//Node<T> previous;				//reference variable to link with previous node
		Node<Object> next;					//reference variable to link with next node
		
	
	/*
	 * parameterized constructor to initialize variables 
	 * @param previous,data,next 
	 * */
	Node(Object data,Node next){
		
		this.data=data;
		this.next=next;

	}

	
}
