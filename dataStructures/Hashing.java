package com.bridgeIt.dataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import com.bridgeIt.dataStructures.OrderedLinkedList.MyNode;

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
		FileReader fr;
		try {
			fr = new FileReader("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files/HashingIn.txt");
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
				   hs.add(in[i]);
			}
			  
			//System.out.println(hs.search(40));  
			 hs.prints();
			 
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
		
	}
	
	
}
