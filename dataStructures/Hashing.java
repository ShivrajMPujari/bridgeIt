package com.bridgeIt.dataStructures;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.bridgeIt.utility.Utility;

public class Hashing {

	public static	OrderedLinkedList [] OL=new OrderedLinkedList[11];
	 /* Function initializes the hash array 
	  * */  
	public void hash(){
		
		for (Integer i = 0; i < OL.length; i++) {
			
			OL[i]= new OrderedLinkedList();
			
		}
		
	}

	/* Function adds the elements in the hash array 
	 * @param integer elements
	  * */ 
	public void add(Integer data){
		Integer div=11;
		Integer i=data%div;
		OL[i].add(data);
	}
	
	/* Function searches the element in the hash table 
	 * @param integer elements
	 * */ 
	public  boolean search(Integer data){
		
		int j=data%11;
		boolean result=OL[j].search(data);
		
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
			
			OL[j].remove(data);
			
		}else{
			
			OL[j].add(data);
		}
	}
	
	
	/* Function prints the elements in the hash table
	 * */ 
	public HashMap prints(){
	
		
		HashMap <Integer,LinkedList> mapper=new HashMap();
		for (int i = 0; i < OL.length; i++) {
			if (OL[i].head!=null) {
				LinkedList list=OL[i].printList();
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
				
				HashMap <Integer,LinkedList> mapper=new HashMap();
				for (int i = 0; i < OL.length; i++) {
					if (OL[i].head!=null) {
						LinkedList list=OL[i].printList();
						mapper.put(i, list);
					
					}
				}
				 for(Map.Entry<Integer,LinkedList> m:mapper.entrySet()){  
					 printwrite.println(m.getKey()+" "+m.getValue().toString());  
				 }
				printwrite.flush();
				printwrite.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
	
}
