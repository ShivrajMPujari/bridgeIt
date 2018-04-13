package com.bridgeIt.dataStructures;

public class Node<N> implements Comparable<N> {

		N data;							//data in a node
		Node<N> previous;				//reference variable to link with previous node
		Node<N> next;					//reference variable to link with next node
		
	
	/*
	 * parameterized constructor to initialize variables 
	 * @param previous,data,next 
	 * */
	Node(Node previous,N data,Node next){
		
		this.previous=previous;
		this.data=data;
		this.next=next;

	}


	@Override
	public int compareTo(N data) {
		
		return this.compareTo(data);
	}
	
}
