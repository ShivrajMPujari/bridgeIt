package com.bridgeIt.dataStructures;

public class Node<T> {

		T data;					//data in a node
		Node previous;				//reference variable to link with previous node
		Node next;					//reference variable to link with next node
		
	
	/*
	 * parameterized constructor to initialize variables 
	 * @param previous,data,next 
	 * */
	Node(Node previous,T data,Node next){
		
		this.previous=previous;
		this.data=data;
		this.next=next;

	}
	
	
	
	
	
}
