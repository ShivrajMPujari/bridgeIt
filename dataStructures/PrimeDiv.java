package com.bridgeIt.dataStructures;

import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class PrimeDiv {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the nth term:");
		int num = Utility.inputInt();							
		
		int[] out = Utility.primeNumbers(num);						
		arraySplit(out);
		
	}
	
	public static void arraySplit(int [] arr){
		int row=30;
		int column=10;
		int row0=0;
		int row1=0;
		int row2=0;
		int row3=0;
		int row4=0;
		int row5=0;
		int row6=0;
		int row7=0;
		int row8=0;
		int row9=0;
		Integer arrayInteger[]=new Integer[arr.length];
		for(int i=0;i<arr.length;i++){
			
			arrayInteger[i]=Integer.valueOf(arr[i]);
			
		}
		 Integer array[][]=new Integer[row][column];
		
		 for (int i = 0; i < arrayInteger.length; i++) {
			
			 Integer num=arrayInteger[i];
			 num=num/100;
			 
			 switch(num){
			 
			 case 0:{
				 if(arrayInteger[i]<100)
				 array[row0++][num]=arrayInteger[i];
				 break;
			 }
			 case 1:{
				 if(arrayInteger[i]<200)
					 array[row1++][num]=arrayInteger[i];
					 break;
			 }
			 case 2:{
				 if(arrayInteger[i]<300)
					 array[row2++][num]=arrayInteger[i];
					 break;
			 }
			 case 3:{
				 if(arrayInteger[i]<400)
					 array[row3++][num]=arrayInteger[i];
					 break;
			 }
			 case 4:{
				 if(arrayInteger[i]<500)
					 array[row4++][num]=arrayInteger[i];
					 break;
			 }
			 case 5:{
				 if(arrayInteger[i]<600)
					 array[row5++][num]=arrayInteger[i];
					 break;
			 }
			 case 6:{
				 if(arrayInteger[i]<700)
					 array[row6++][num]=arrayInteger[i];
					 break;
			 }
			 case 7:{
				 if(arrayInteger[i]<800)
					 array[row7++][num]=arrayInteger[i];
					 break;
			 }
			 case 8:{
				 if(arrayInteger[i]<900)
					 array[row8++][num]=arrayInteger[i];
					 break;
			 }
			 case 9:{
				 if(arrayInteger[i]<1000)
					 array[row9++][num]=arrayInteger[i];
					 break;
			 }
			 
			 }
			 
			 
			
			 
		}
		 prints2dArray(array, row, column);
		
	}
	
	public static <T extends Comparable<T>> void prints2dArray(T[][] array,int row ,int column){
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("%4d ", array[i][j]);
			}
			System.out.println( );
				}
	
	}
	public static  void makeZero(Integer[][] array,int row ,int column){
	

	for (int i = 0; i < row; i++) {
		for (int j = 0; j < column; j++) {
			
			if(array[i][j]==null){
				
				array[i][j]=0;
			}
			
		}
			}
	
}
}


