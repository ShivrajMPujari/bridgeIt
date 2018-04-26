
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
	static int size;
	
	
	/* Function adds the elements inside a list
	 * @param data to add inside list
	 * */
	public static <T extends Comparable<T>> void add(T data){
		
		if(head==null)
		{
			Node node =new Node(data,null);
			head=node;
			size++;
			return;
		}		
		else{
			
			 current=head;
			while(current.next!=null){

				current=current.next;
				

			}
			Node node =new Node(data,null);
			current.next=node;
			
		}
		
		
		size++;
	}

		
	/* Function searches the elements inside a list
	 * @param data to be searched inside list
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
	public static <T extends Comparable<T>> void printingList(String file){
		
		FileWriter filewrite;
		PrintWriter printwrite;
		try {

			filewrite = new FileWriter("//home/bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//"+file+"");
			printwrite=new PrintWriter(filewrite);
			
			current=head;
			if(current.data==null){
				return;
			}
			while(current.data!=null){
				
				//Utility.printData("unorderedList.txt", (T) current.data);
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
	
	
	
	
	
	
	/* Function appends the data
	 * @param data to be added inside list
	 * */
	public <T extends Comparable<T>> void append(T data)
	{
		this.add(data);
	}
	
	
	/* Function perform action to remove or add the elements
	 * @param data to be added or removed inside list
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
			 size--;
			}

	/* Function removes the elements inside a list
	 * */
	public void pop() 
	{
		if(head==null)
		{
			System.out.println("No elements to remove");	
		}
		else
		{
			Node curr=head;
			Node prev=null;
			while(curr.next!=null)
			{
				prev=curr;
				curr=curr.next;
			}
			prev.next=null;
		}
		size--;
	}
	
	/* Function removes the elements inside a list
	 * @returns the size of list
	 * */
	public int size(){
		
		return size;
		
	}
	

	/* Function removes the elements inside a list
	 * @param integer position
	 * */
	public void pop(int pos) 
	{
		if(pos>size()-1 || pos<1)
		{
			System.out.println("Cannot pop");
		}
		if(pos==1)
		{
			Node temp=head;
			head=head.next;
			temp.next=null;
		}
		else
		{
			Node previous=head;
			int count=1;
			while(count<pos-1)
			{
				previous=previous.next;
				count++;
			}
			Node current=previous.next;
			previous.next=current.next;
			current.next=null;
		}
		size--;
	}
	
	
	public static void main(String[] args) {
		
		String[] str = Utility.readFile("unorderedList.txt");
		UnorderedList un = new UnorderedList();
		for (int i = 0; i < str.length; i++) {

			un.add(str[i]);
		}
		
		action("raj");
		action("jay");
		action("jack");
		action("jay");
	

	} 
	
	
	

}
