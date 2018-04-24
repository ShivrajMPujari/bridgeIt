package com.bridgeIt.dataStructures;

import java.util.Arrays;


public class Stack <T extends Comparable<T>> {
	
	T data;
	T top;
	MyNode<T> first;
	public static int size=0;
	
	
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
			
			System.out.print(" "+current.data);
			current=current.next;
		}

	}

	public void printStackCalender(){
		int i=0;
		MyNode current=first;
		while(current!=null){
			if(i%7==0){System.out.println();}
			System.out.printf("%4s",current.data);
			i++;
			current=current.next;
		}

	}
	
	public T pop(){
		
		MyNode current=first;
		T node=first.data;
		first=current.next;
		current=null;
		size--;
		return node;
		
	}
	public int size(){
		return size;
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
