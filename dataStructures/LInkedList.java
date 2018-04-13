package com.bridgeIt.dataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LInkedList {

	
	static Node head;
	public static <N extends Comparable<N>> void remove(N data ){
		Node current=head;
		if(current.data.equals(data)){
			
			head=current.next;
	
		}
		else{
			
			while(current.data.equals(data)!=true){
				
				current=current.next;
			}
			
			current.next.previous=current.previous;
			current.previous.next=current.next;
			
			
		}

		
	}
	
	public static<N extends Comparable<N>> boolean search(N data ){
			
			Node current=head;
			while(current!=null){
				
				if(current.data.equals(data)){
					
					System.out.println(current.data);
						return true;
						
					}else{
						
						if(current.next==null){
							return false;
						}
						current=current.next;
						System.out.println(current.data+"--");
						
						
					}

			}
			
			return false;

		}
	
	public static <N extends Comparable<N>> void add(N data){
		Node current=head;
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
	
	public static <N extends Comparable<N>> void printList(){
		
		Node current=head;
		if(current.data==null){
			return;
		}
		while(current.data!=null){
			
			System.out.println(current.data);
		//	printWriting();
			current=current.next;
			if(current==null)break;
		}
				}
	
	public static  <N extends Comparable<N>> void action(N data){
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
			LInkedList ls=new LInkedList();
				  for (int i = 0; i < s.length; i++) {
					
					  ls.add(s[i]);
				}
				  
				  ls.action("raj");
				  ls.action("world");
				//  printList();
				  ls.printer();
				  
				  
				  
				  
			///	ls.action("raj");
				/*ls.action("world");*/
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
		

			
		}
		
		public static  <N extends Comparable<N>> void printer(){
			
			FileWriter fw;
			PrintWriter pw;
			try {
				fw = new FileWriter("//home/bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//UnorderedFileOut.txt");
				 pw=new PrintWriter(fw);
				//pw.print(data);
				
				 Node current=head;
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
		
}
