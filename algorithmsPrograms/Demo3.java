package com.bridgeIt.algorithmsPrograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgeIt.utility.Utility;

public class Demo3 {

	public static void main(String[] args) {
		
		
		String [] st={"zon","bcon","ac","mk","za","ad"};
		Integer arr[]= {2,3,1,54,0,7,5};
		insertionStopWatch(arr);
		insertionStopWatch(st);
		binarySearch(arr, 0);
	
	
	}

	//Method For Insertion Sort
    public static <T extends Comparable<T>> void insertionSort(T array[]) {
        int length=array.length;
        int j;
        T temp;
        for(int i=0;i<length;i++)
        {
            j=i;
            temp = array[i];
            while(j>0&&temp.compareTo(array[j-1])<0)
            {
                array[j]=array[j-1];
                j=j-1;
            }
            array[j]=temp;//insert unsorted element
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static <T extends Comparable<T>> double insertionStopWatch(T[] array){
		double start=0;
		double end=0;
		double result=0;
	//	String [] st={"zon","bcon","ac","mk","za","ad"};
	//	Integer arr[]= {2,3,1,54,0,7,5};
		start = Utility.getTimeNano();
		System.out.println(start);
		insertionSort(array);
		end = Utility.getTimeNano();
		System.out.println(end);
		result=Utility.stopWatchNano(start, end);
		return result;
	}
    
  //StopWatch for Insertion sort String
	
  	public static <T extends Comparable<T>> double binarySearchStopWatch(T[] array){
  		double start=0;
  		double end=0;
  		double result=0;
  		//String [] st={"zon","bcon","ac","mk","za","ad"};
  		start = Utility.getTimeNano();
  		System.out.println(start);
  		insertionSort(array);
  		end = Utility.getTimeNano();
  		System.out.println(end);
  		result=Utility.stopWatchNano(start, end);
  		return result;
  	}
  	
    public static<T extends Comparable<T>> void binarySearch(T[] array,T search)
    {
        int length=array.length;
        int first=0;
        int last=length-1;
        int mid;
       
        while(first<=last)
        {    mid=(first+last)/2;
            if(array[mid].compareTo(search)<0)
            {
                first=mid+1;
            }
            else if(array[mid].compareTo(search)==0)
            {
                System.out.println(search+" found in location "+mid);
                break;
            }
            else if(array[mid].compareTo(search)>0)
            {
                last=mid-1;
            }
        }
        if(first > last)
        {
            System.out.println(search+"Not found");
        }
 
        
}
    
}
