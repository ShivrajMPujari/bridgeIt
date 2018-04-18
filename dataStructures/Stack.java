package com.bridgeIt.dataStructures;

import java.util.Arrays;

import com.bridgeIt.dataStructures.OrderedLinkedList.MyNode;

public class Stack <T extends Comparable<T>> {
	
	
	T data;
	T top;
	MyNode<T> first;
	static int size=0;
	
	
	public void push(T data){
		
		if(first==null){
			
		MyNode node= new MyNode(data);
		first=node;
			size++;
			return;
		}
		MyNode node= new MyNode(data);
		node.next=first;
		first=node;
		size++;
	}
	
	public void printStack(){
		
		MyNode current=first;
		while(current!=null){
			
			System.out.println(current.data);
			current=current.next;
		}
		
		
	}
	
	public void pop(){
		
		MyNode current=first;
		first=current.next;
		current=null;
		size--;
		
	}
	
	public static void main(String[] args) {
		
		Stack st= new Stack<>();
		String str="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='{'){
				
				st.push('{');
				
			}else if(str.charAt(i)=='{'){
				
				st.pop();
				
			}
		}
		
		
		if(size==0){
			System.out.println("it is balanced expression");
		}else{
			
			System.out.println("it is not balanced expression");
		}
	}
	
	
	static class MyNode<T>{
		T data;			//data to be stored
		MyNode<T> next;	//reference to the next node
		
		MyNode(T data){
			this.data = data;
			next = null;
		}
	
	}
}
