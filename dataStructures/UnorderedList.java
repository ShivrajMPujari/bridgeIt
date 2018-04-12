package com.bridgeIt.dataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
	public static <T extends Comparable<T>> void remove(T data){
		
			current=head;
			if(head.data==data){
				
				head.next=head;
				head.previous=null;
				return;
			}
			
			while(current.data!=data){
				
				current=current.next;

			}
			if(current.next==null){
				
				current.previous.next=null;
				return;
				
			}
			current.previous.next=current.next;
			current.next.previous=current.previous;
			current.next=null;
			current.previous=null;
			
	}
		
	/* Function removes the elements inside a list
	 * @param data to be removed inside list
	 * */
	public static <T extends Comparable<T>> boolean search(T data){
		
		Node current=head;
		while(current.data!=data){
			
			/*if(current.next==null) return false;
			if(current.next.data==data) return true;*/
			if(current.next==null){
				System.out.println(current.data+"--");
				return false;}
			current=current.next;
			
			
		}

		
	return true;	

	}
	
	public static <T extends Comparable<T>> void printList(){
		
	  current=head;
		
	if(current.data==null){
		return;
	}
	while(current.data!=null){
		
		System.out.println(current.data);
	//	printWriting((T) current.data);
		current=current.next;
		if(current==null)break;
	}
		
		
	}
	
	public static  <T extends Comparable<T>> void action(T data){
		boolean res=search(data);
		System.out.println(res);
		if(search(data)==true){
			
		remove(data);
			
		}else{
			
			add(data);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		FileReader fr;
		try {
			fr = new FileReader("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files/unorderedList.txt");
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
			  UnorderedList un= new UnorderedList();
			  for (int i = 0; i < s.length; i++) {
				
				  un.add(s[i]);
			}
			  
			
		//	printList();
			
			action("raj");
			action("world");
			action("raj");
		//	printList();
			
			printWriting();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		
		
	}
	
	public static  <T extends Comparable<T>> void printWriting(){
		
		
		FileWriter fw;
		PrintWriter pw;
		try {
			fw = new FileWriter("//home/bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//UnorderedFileOut.txt");
			 pw=new PrintWriter(fw);
			//pw.print(data);
			
			 current=head;
				
				if(current.data==null){
					return;
				}
				while(current.data!=null){
					
					System.out.println(current.data);
					pw.print(current.data+" ");
					current=current.next;
					if(current==null)break;
				}

			
			
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	
	
		
	}
	

