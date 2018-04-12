package com.bridgeIt.algorithmsPrograms;

import com.bridgeIt.utility.Utility;

public class Demo2 {

	public static void main(String[] args) {

		
		String st=increseLength(8);
		System.out.println(st);
		  String s=swapNibble(st);
	    System.out.println(s);
		int num=toInt(s);
		boolean result=findPowOfTwo(st);
		
		System.out.println(num+" is resultant number");
		System.out.println(num+" is power of 2 ? :- "+ result);
	
		
		
	}
	
	public static String increseLength(int number){
		
		String binary=Utility.toBinary(number);
		
		while(binary.length()!=8){

			binary="0"+binary;

		}
	
		return binary;
	}
	
	public static String swapNibble(String binary){
		
		//creating char array ch[]
		char ch[]= binary.toCharArray();
		char temp=' ';						
		
		for (int i = 0; i <(binary.length()/2); i++) {
			
				temp = ch[i] ;
		        ch[i] = ch[i+4];
		        ch[i+4] = temp;
			
		}
		
		String result= new String(ch);
		return result;
		

	}
	
	public static int toInt(String binary){
		
		int j=0;
		int sum=0;
		for(int i=binary.length()-1;i>=0;i--){
			if(binary.charAt(i)=='1'){
				
				sum=sum+Utility.raiseToTwo(j);

			}
			
			j++;
		}

		return sum;
		
	}
	

	public static boolean findPowOfTwo(String binary){
		
		int count=0;
		for (int i = 0; i < binary.length(); i++) {
			
			
			if(binary.charAt(i)=='1'){
				count++;

			}
			
		}
		
		if(count==1){
			return true;
			
		}else{
			
			return false;
		}
		
	}
	
	
}
