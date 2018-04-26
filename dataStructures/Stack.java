package com.bridgeIt.dataStructures;

public class Stack <T extends Comparable<T>> {
	
	T data;
	T top;
	MyNode<T> first;
	public static int size=0;
	
	 /* Function pushes the elements in the stack
	  * @param  Comparable data 
	  * */ 
	public void push(T data){
		
		if(first==null){
			
		MyNode<T> node= new MyNode<T>(data);
		first=node;
			size++;
			return;
		}
		MyNode<T> node= new MyNode<T>(data);
		node.next=first;
		first=node;
		size++;
	}
	
	 /* Function prints the elements in the Stack
	  * */ 
	public void printStack(){
		
		MyNode<T> current=first;
		while(current!=null){
			
			System.out.print(" "+current.data);
			current=current.next;
		}

	}

	/* Function prints the calendar from the stack  
	  * */
	public void printStackCalender(){
		int i=0;
		MyNode<T> current=first;
		while(current!=null){
			if(i%7==0){System.out.println();}
			System.out.printf("%4s",current.data);
			i++;
			current=current.next;
		}

	}
	
	/* Function pops the elements out of the stack
	  * @param  data
	  * */
	public T pop(){
		
		MyNode<T> current=first;
		T node=first.data;
		first=current.next;
		current=null;
		size--;
		return node;
		
	}
	
	/* Function gives the size of the stack
	  * @return the size
	  * */
	public int size(){
		return size;
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
