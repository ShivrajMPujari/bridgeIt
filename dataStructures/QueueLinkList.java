package com.bridgeIt.dataStructures;

import org.json.simple.JSONArray;

public class QueueLinkList <T extends Comparable<T>> {

	MyNode<T> first;

	 /* Function pushes the data in the queue
	  * @param  Comparable data 
	  * */ 
	public void enqueue(T data){
		
		if(first==null){
			
			MyNode<T> newNode = new MyNode<T>(data);
			first=newNode;
			return;
		}
		else{
			MyNode<T> current=first;
			while(current.next!=null){
				
				current=current.next;
				
			}
			MyNode<T> newNode = new MyNode<T>(data);
			current.next=newNode;
		}
	}
	
	/* Function removes  the data in the queue
	  * @return boolean,if the data is removed
	  * */ 
	public boolean dequeue(){
		
		MyNode<T> current=first;
		first=current.next;
		current=null;
		return true;
	}
	
	/* Function prints  the data in the queue
	  * */ 
	public void printQueue(){
		
		MyNode<T> current=first;
		while(current!=null){
			
			System.out.println(current.data);
			current= current.next;	
		}
	}
	
	public JSONArray toJsonArray(){
		JSONArray array = new JSONArray();
		
		MyNode<T> current=first;
		while(current!=null){
			
			System.out.println(current.data);
			array.add(current.data);
			current= current.next;	
		}
		return	array;
	}
	
	/* Function prints the calendar by traversing in the queue
	  * */
	public void printCalender(){
		
		MyNode<T> current=first;
		while(current!=null){
			
			System.out.print(current.data);
			current= current.next;	
		}
		
		
	}
	
	static class MyNode<T>{
		T data;			
		MyNode<T> next;		
		MyNode(T data){
			this.data = data;
			next = null;
		}
}
}
