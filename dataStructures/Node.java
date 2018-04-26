package com.bridgeIt.dataStructures;

public class Node<T> implements Comparable<T> {

		T data;							//data in a node
		//Node<T> previous;				//reference variable to link with previous node
		Node<T> next;					//reference variable to link with next node
		
	
	/*
	 * parameterized constructor to initialize variables 
	 * @param previous,data,next 
	 * */
	Node(T data,Node next){
		
		this.data=data;
		this.next=next;

	}

	@Override
	public int compareTo(T data) {
		
		return this.compareTo(data);
	}
	
}
