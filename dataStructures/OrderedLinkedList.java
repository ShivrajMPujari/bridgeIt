package com.bridgeIt.dataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.bridgeIt.utility.Utility;

public class OrderedLinkedList<T extends Comparable<T>>{

	MyNode<T> head;		
	MyNode<T> current;	
	int position;		//position of last node

	
	public OrderedLinkedList(){
		head = null;
		current = null;
		position = -1;
	}

	
	/* Function adds the elements inside a list
	 * @param data to add inside list
	 * */
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
	
	
	/* Function removes the elements inside a list
	 * @param data to removed inside list
	 * */
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
	
	
	/* Function searches the elements inside a list
	 * @param data to be searched inside list
	 * */
	public boolean search(T data){
		
		 current=head;
			while(current.data.equals(data)!=true){
				if(current.next==null) return false;
				if(current.next==null){		
					return false;}
					current=current.next;
				
				
			}
			
			if(current.data.equals(data))return true;
					
			return false;
		
	}
	
	
	/* Function checks whether the list is empty or not
	 * @returns boolean true if list is empty
	 * */
	public boolean isEmpty(){
		return position == -1 ? true : false;
	}

	/* Function checks size of the list
	 * @returns integer size 
	 * */
	public int size(){
		return position + 1;
	}
	
	
	/* Function adds the element in the list
	 * @returns integer size 
	 * */
	public void append(T data){
		add(data);
	}
	
	/* Function returns the position of the data 
	 * @param generic data 
	 * @returns the position in the list 
	 * */
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



	/* Function prints the list in file 
	 * */
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
	
	/* Function perform action to remove or add the elements
	 * @param data to be added or removed inside list
	 * */
	public void action(T data){
		
		if(search( data)==true){
			
			remove(data);
			
		}else{
			add(data);
		}	
	}
	
	
	/* Function add the elements in the file
	 * @param String file name
	 * */
	public  void printer(String file){
			 MyNode current=head;
				if(current.data==null){
					return;
				}
				while(current.data!=null){
					Utility.printData(file, (T) current.data);
					current=current.next;
					if(current==null)break;
				}
		} 

	
	/**Function prints the data of ordered list in  the the file
	 * @param file String name of the file
	 */
	public  <T extends Comparable<T>> void printingList(String file){
		
		FileWriter filewrite;
		PrintWriter printwrite;
		try {

			filewrite = new FileWriter("//home/bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//"+file+"");
			printwrite=new PrintWriter(filewrite);
			
			 MyNode current=head;
			if(current.data==null){
				return;
			}
			while(current.data!=null){
				
				printwrite.print(current.data+" ");
				
				current=current.next;
				if(current==null)break;
			}
			printwrite.flush();
			printwrite.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			}
	
	
	
	public  void printer1(){
		 MyNode current=head;
			if(current.data==null){
				return;
			}
			while(current.data!=null){
				Utility.printData("OrderedListOut.txt", (T) current.data);
				current=current.next;
				if(current==null)break;
			}
	} 
	
	
	public static void main(String[] args) {
		
		OrderedLinkedList ol= new OrderedLinkedList<>();	 
		 String [] s=Utility.readFile("OrderedListIn.txt");
		Integer[] in= new Integer[s.length];
		
			  for (int i = 0; i < s.length; i++) {
				  
				   in[i]=Integer.valueOf(s[i]);
				   ol.add(in[i]);
			}
			  ol.action(32);
			  ol.printList();
			  ol.printer("OrderedListOut.txt");
	}
	}
	




	class MyNode<T>{
		T data;			//data to be stored
		MyNode<T> next;	//reference to the next node
		
		MyNode(T data){
			this.data = data;
			next = null;
		}
}


