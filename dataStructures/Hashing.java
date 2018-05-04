package com.bridgeIt.dataStructures;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;



public class Hashing {

	@SuppressWarnings("rawtypes")
	public static	OrderedLinkedList [] LISTARRAY=new OrderedLinkedList[11];
	
	/* Function initializes the hash array 
	  * */  
	@SuppressWarnings("rawtypes")
	public void hash(){
		
		for (Integer i = 0; i < LISTARRAY.length; i++) {
			
			LISTARRAY[i]= new OrderedLinkedList();
			
		}
		
	}

	/* Function adds the elements in the hash array 
	 * @param integer elements
	  * */ 
	@SuppressWarnings("unchecked")
	public void add(Integer data){
		Integer div=11;
		Integer i=data%div;
		LISTARRAY[i].add(data);
	}
	
	/* Function searches the element in the hash table 
	 * @param integer elements
	 * */ 
	public  boolean search(Integer data){
		
		int j=data%11;
		boolean result=LISTARRAY[j].search(data);
		
		return result;
	}
	
	/* Function performs searching and deletion if element is present or add the element if not present
	 * @param integer elements
	 * */ 
	public void actions(Integer data){
		
		int j=data%11;
		Hashing hs =new Hashing();
		boolean outcome=hs.search(data);
		if(outcome==true){
			
			LISTARRAY[j].remove(data);
			
		}else{
			
			LISTARRAY[j].add(data);
		}
	}
	
	
	/* Function prints the elements in the hash table
	 * */ 
	public HashMap<Integer, LinkedList> prints(){
	
		
		HashMap <Integer,LinkedList> mapper=new HashMap<Integer, LinkedList>();
		for (int i = 0; i < LISTARRAY.length; i++) {
			if (LISTARRAY[i].head!=null) {
				LinkedList list=LISTARRAY[i].printList();
				mapper.put(i, list);
			
			}
		}
		
		 for(Map.Entry<Integer,LinkedList> m:mapper.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue().toString());  
		 }
		 
		return mapper;
	}
	
	/* Function writes the content in file 
	 * @param file name with extension,data any literals
	 * */
	public  <T extends Comparable<T>> void printHashing(String file){
			
			FileWriter filewrite;
			PrintWriter printwrite;
			try {
	
				filewrite = new FileWriter("//home/bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//"+file+"");
				printwrite=new PrintWriter(filewrite);
				
				HashMap <Integer,LinkedList> mapper=new HashMap<Integer, LinkedList>();
				for (int i = 0; i < LISTARRAY.length; i++) {
					if (LISTARRAY[i].head!=null) {
						LinkedList list=LISTARRAY[i].printList();
						mapper.put(i, list);
					}
				}
				 for(Map.Entry<Integer,LinkedList> m:mapper.entrySet()){  
					LinkedList lister=m.getValue();
					for (Object object : lister) {
						System.out.println(object);
						printwrite.print(object+" "); 
					}
					 
				 }
				printwrite.flush();
				printwrite.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
	
}
