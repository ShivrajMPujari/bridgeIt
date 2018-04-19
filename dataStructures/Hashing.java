package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class Hashing {

	public static	OrderedLinkedList [] OL=new OrderedLinkedList[11];
	public void hash(){
		
		for (int i = 0; i < OL.length; i++) {
			
			OL[i]= new OrderedLinkedList();
			
		}
		
	}
	
	public void add(Integer data){
		Integer div=11;
		Integer i=data%div;
		OL[i].add(data);
	}
	
	public  boolean search(Integer data){
		
		int j=data%11;
		boolean result=OL[j].search(data);
		
		return result;
	}
	
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
	
	public void prints(){
		
		for (int i = 0; i < OL.length; i++) {
			if (OL[i].head!=null) {
				OL[i].printList();
				OL[i].printer("HashingOut.txt");
			}
		}
	}
	
	public static void main(String[] args) {
		Hashing hs=new Hashing();
		hs.hash();			
		 String [] s=Utility.readFile("HashingIn.txt");
			Integer[] in= new Integer[s.length];
		
			  for (int i = 0; i < s.length; i++) {
				  
				   in[i]=Integer.valueOf(s[i]);
				   hs.add(in[i]);
			}
			  
			 hs.prints();
			 
	} 
	
}
