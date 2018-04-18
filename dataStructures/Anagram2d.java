package com.bridgeIt.dataStructures;

import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class Anagram2d {

	public static void main(String[] args) {
		
		System.out.println("Enter the nth term:");
		int num = Utility.inputInt();							
		
		int[] out = Utility.primeNumbers(num);	
		Integer[] anagrams=anagramArray(out);
		Integer[] primeanagrams=primeAnagramArray(anagrams);
		System.out.println(Arrays.toString(primeanagrams));
		
		
		
	}
	
	public static Integer[] primeAnagramArray(Integer arr[]){
	//	Integer result[]=new Integer[]
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=null)
				count++;
		}
		
	//	System.out.println(count);
		Integer result[]=new Integer[count];
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=null)
				result[index++]=arr[i];
		}
		
		return result;
		
	}
	
	
	public static Integer[] anagramArray(int prime[]){
		Integer	anagramArray[][]= new Integer[1000][2];
		Integer anagram[]=new Integer[400];
		int index=0;
		int row0=0;
		int row1=0;
		int colmn0=0;
		int colmn1=1;
		
		for (int i = 0; i < prime.length-1; i++) {
			int count=0;
			for (int j = i+1; j < prime.length; j++) {
				if(Utility.checkIntAnagaram(prime[i], prime[j])){
					
					anagramArray[row0++][colmn0]=Integer.valueOf(prime[i]);
					count++;
					anagramArray[row0++][colmn0]= Integer.valueOf(prime[j]);
					anagram[index++]=prime[i];
					anagram[index++]=prime[j];
					
				}
			}
			if(count==0)
			anagramArray[row1++][colmn1]=prime[i];
			
		}

		//prints2dArray(anagramArray, 200, 2);
		return anagram;
	}
	

		public static <T extends Comparable<T>> void prints2dArray(T[][] array,int row ,int column){
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					System.out.printf("%4d ", array[i][j]);
				}
				System.out.println( );
					}
		
		}
	

	
}
