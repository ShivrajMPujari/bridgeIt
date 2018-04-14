package com.bridgeIt.dataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OrderedLinkedList<T extends Comparable<T>>{

	MyNode<T> head;	//starting node
	MyNode<T> current;	//last node
	int position;	//position of last node

	public OrderedLinkedList(){
		head = null;
		current = null;
		position = -1;
	}

	
	public void add(T data) 
	{
		
		MyNode<T> newNode = new MyNode<T>(data);
		if(head == null) {
			head = newNode;
			current = head;
		}
		else if(head.data.compareTo(data) > 0) 
		{
			newNode.next = head;
			head = newNode;
		}
		else if(current.data.compareTo(data) < 0) {
			current.next = newNode;
			current = newNode;
		}
		else {
			
			MyNode<T> tempPrev = head;
			MyNode<T> tempCurrent = head.next;
			
			while((tempCurrent != current) && (tempCurrent.data.compareTo(data) < 0)) {
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;	
				
			}
			tempPrev.next = newNode;
			newNode.next = tempCurrent;
		}
		position++;
	}
	
	
	public void remove(T data){
		MyNode<T> tempCurrent = head;
		MyNode<T> tempPrev = null;
		while(!tempCurrent.data.equals(data)){
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
		}
		if(tempCurrent == head){
			head = head.next;
		}
		else{
			tempPrev.next = tempCurrent.next;
		}
		if(tempCurrent == current){
			current = tempPrev;
		}
		position--;
	}
	
	
	public boolean search(T data){
		return index(data) == -1 ? false : true; 
	}
	
	public boolean isEmpty(){
		return position == -1 ? true : false;
	}
	
	
	
	public int size(){
		return position + 1;
	}
	
	public void append(T data){
		add(data);
	}
	
	public int index(T data){
		if(position == -1){
			return -1;
		}
		MyNode<T> tempCurrent = head;
		int tempPosition = 0;
		
		while(!tempCurrent.data.equals(data)){
			if(tempCurrent == current) {
				return -1;
			}
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		return tempPosition;
	}

	public void insert(int pos , T data){

		if((pos == position+1) || (position == -1)){
			add(data);
		}
		else if(pos == 0){
			MyNode<T> tempNode = head;
			head = new MyNode<T>(data);
			head.next = tempNode;
		}
		else{
			MyNode<T> tempCurrent = head;
			MyNode<T> tempPrev = null;
			int tempPosition = 0;
			while(tempPosition <= pos + 1){
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;
				tempPosition++;
			}
			MyNode<T> newNode = new MyNode<T>(data);
			newNode.next = tempCurrent;
			tempPrev.next = newNode;
		}
		position++;
	}
	
	public T pop(int location){
		MyNode<T> tempCurrent = head;
		MyNode<T> tempPrev = null;
		int tempPosition = 0;
		position--;
		while(tempPosition != location){
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		if(tempCurrent == head){
			head = head.next;
			return tempCurrent.data;
		}
		else if(tempCurrent == current){
			current = tempPrev;
			tempPrev.next = tempCurrent.next;
			return tempCurrent.data;
		}
		else{
			tempPrev.next = tempCurrent.next;
			return tempCurrent.data;
		}
	}
	
	
	public T pop(){
		return pop(position);
	}
	
	public T get(int location) {
		MyNode<T> tempCurrent = head;
		int tempPosition = 0;
		
		while(tempPosition != location){
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		
		return tempCurrent.data;
		
	}
	
	public void list(){
		MyNode<T> tempCurrent = head;
		while(tempCurrent != null){
			System.out.print(tempCurrent.data+",");
			tempCurrent = tempCurrent.next;
		}
		}
	public  void printList(){
			
			MyNode current=head;
			if(current.data==null){
				return;
			}
			while(current.data!=null){
				
				System.out.println(current.data);
				current=current.next;
				if(current==null)break;
			}
					}
	public void action(T data){
		
		if(search( data)==true){
			
			remove(data);
			
		}else{
			add(data);
		}
		
		
	}
	
	public  void printer(){
		
		FileWriter fw;
		PrintWriter pw;
		try {
			fw = new FileWriter("//home/bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//OrderedListOut.txt");
			 pw=new PrintWriter(fw);
			//pw.print(data);
			
			 MyNode current=head;
				if(current.data==null){
					return;
				}
				while(current.data!=null){
					
					System.out.println(current.data);
					pw.print(current.data+" ");
				//	printWriting();
					current=current.next;
					if(current==null)break;
				}

			pw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
		OrderedLinkedList ol= new OrderedLinkedList<>();
		FileReader fr;
		try {
			fr = new FileReader("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files/OrderedListIn.txt");
			BufferedReader br = new BufferedReader(fr);
			String read=br.readLine();
			String concat=read;
			while(read!=null){
				
				read=br.readLine();
				if(read==null){break;}
				concat=concat+read;
			}
			System.out.println(concat);
			 String [] s=concat.split("\\s");					//Splitting a string to string array
			 Integer[] in= new Integer[s.length];
		
			  for (int i = 0; i < s.length; i++) {
				  
				   in[i]=Integer.valueOf(s[i]);
				   ol.add(in[i]);
				 //  System.out.println(in[i]);
			}
			 
			  ol.action(32);
			  ol.printList();
			  ol.printer();
	} catch (IOException e) {
		
		e.printStackTrace();
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

