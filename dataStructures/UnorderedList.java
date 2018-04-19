package com.bridgeIt.dataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.bridgeIt.utility.Utility;

public class UnorderedList {

	static Node current;										//current node
	static Node head;											//head node
	
	
	
	/* Function adds the elements inside a list
	 * @param data to add inside list
	 * */
	public static <T extends Comparable<T>> void add(T data){
		
		if(head==null)
		{
			Node node =new Node(null,data,null);
			head=node;
			return;
		}		
		else{
			
			 current=head;
			while(current.next!=null){
				
				current=current.next;
				

			}
			Node node =new Node(current,data,null);
			current.next=node;
			
		}
		
		
		
	}

		
	/* Function removes the elements inside a list
	 * @param data to be removed inside list
	 * */
	public static <T extends Comparable<T>> boolean search(T data){
		
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
	
	
	/* Function prints the list in file 
	 * */
	public static <T extends Comparable<T>> void printList(){
		
	current=head;
	if(current.data==null){
		return;
	}
	while(current.data!=null){
		
		Utility.printData("UnorderedFileOut.txt", (T) current.data);
		current=current.next;
		if(current==null)break;
	}
			}
	
	
	
	
	/* Function perform action to remove or add the elements
	 * @param data to be removed inside list
	 * */
	public static  <T extends Comparable<T>> void action(T data){
		if(search(data)==true){

			removing(data);
		}else{
			
			add(data);
		}
		
	}
	
	
	/* Function removes the elements inside a list
	 * @param data to be removed inside list
	 * */
	public static  <T extends Comparable<T>> void removing(T item) 
	{
		if(head==null)
		{
			System.out.println("No elements to remove");	
		}
		else
		{
			Node temp=head;
			if(temp.data==item)
			{
				head=temp.next;
			}
			else
			{
				while(!(temp.next.data.equals(item)) && temp.next!=null)
				{
					temp=temp.next;
				}
				System.out.println(temp.next.data+" is deleted");
				temp.next=temp.next.next;
			}
		}

}

	
	public static void main(String[] args) {
		String[] s = Utility.readFile("unorderedList.txt");
		UnorderedList un = new UnorderedList();
		for (int i = 0; i < s.length; i++) {

			un.add(s[i]);

		}

		action("raj");
		action("jay");
		action("jack");
		action("jay");
		printList();

	} 
	
	
	

}
