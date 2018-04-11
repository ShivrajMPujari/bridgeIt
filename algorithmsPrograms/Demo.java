package com.bridgeIt.algorithmsPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public  class Demo {

	public static void main(String[] args) {
		
	
	
		/*bSortStringStopWatch();
		bSortIntStopWatch();
		iSortIntStopWatch();*/
		
		
		
	}
	
	
	public static double bSortStringStopWatch(){
		double start=0;
		double end=0;
		double result=0;
		Object [] st={"zon","bcon","ac","mk","za","ad"};
		String[] st1= (String[]) st;
		start = Utility.getTimeNano();
		System.out.println(start);
		bSortString(st1);
		end = Utility.getTimeNano();
		System.out.println(end);
		result=Utility.stopWatchNano(start, end);
		return result;
	}
	
	public static double bSortIntStopWatch(){
		double start=0;
		double end=0;
		double result=0;
	
		int arr[]= {2,3,1,54,0,7,5};
		start = Utility.getTimeNano();
		System.out.println(start);
		Utility.binarySortInt(arr);
		end = Utility.getTimeNano();
		System.out.println(end);
		result=Utility.stopWatchNano(start, end);
		return result;
	}

	//StopWatch for insertion integer
	
		public static double iSortIntStopWatch(){
			double start=0;
			double end=0;
			double result=0;
		//	String [] st={"zon","bcon","ac","mk","za","ad"};
			int arr[]= {2,3,1,54,0,7,5};
			start = Utility.getTimeNano();
			System.out.println(start);
			Utility.iSortInt(arr);
			end = Utility.getTimeNano();
			System.out.println(end);
			result=Utility.stopWatchNano(start, end);
			return result;
		}
		
		public static void bSortString(String st[]) {

			
			for (int i = 0; i < st.length; i++) {

				for (int j = i + 1; j < st.length; j++) {

					if (st[i].compareTo(st[j])>0) {

						String temp = st[i];
						st[i] = st[j];
						st[j] = temp;

					}

				}

			}

			for (int i = 0; i < st.length; i++) {

				System.out.println(st[i]);

			}

		}
	
}
