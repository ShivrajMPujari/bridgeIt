package com.bridgeIt.dataStructures;

import java.util.Scanner;


public class QueueLinkList <T extends Comparable<T>> {

	MyNode first;
	public static QueueLinkList q = new QueueLinkList<>();

	public void enqueue(T data){
		
		if(first==null){
			
			MyNode<T> newNode = new MyNode<T>(data);
			first=newNode;
			return;
		}
		else{
			MyNode current=first;
			while(current.next!=null){
				
				current=current.next;
				
			}
			MyNode<T> newNode = new MyNode<T>(data);
			current.next=newNode;
		}
	}
	public boolean dequeue(){
		
		MyNode current=first;
		first=current.next;
		current=null;
		return true;
	}
	
	public void printQueue(){
		
		MyNode current=first;
		while(current!=null){
			
			System.out.println(current.data);
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
