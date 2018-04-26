package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class Hashing {

	public static	OrderedLinkedList [] OL=new OrderedLinkedList[11];
	
	 /* Function intializes the hash array 
	  * */  
	public void hash(){
		
		for (int i = 0; i < OL.length; i++) {
			
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
	public void prints(){
		
		for (int i = 0; i < OL.length; i++) {
			if (OL[i].head!=null) {
				OL[i].printList();
				OL[i].printer("HashingOut.txt");
			}
		}
	}

	
}
