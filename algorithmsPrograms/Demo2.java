package com.bridgeIt.algorithmsPrograms;

public class Demo2 {

	public static void main(String[] args) {

		int num=8;
		
		String st="";
		while(true){
			if(num>0){
				
				if(num%2==0){
					st="0"+st;
				
					num=num/2;
					
				}else{

					st="1"+st;
					num=num/2;
				}
				if(num==0)break;
			}
			
		
		}
		
		System.out.println(st);
	}
	
	
	
	
}
