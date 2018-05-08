package com.bridgeIt.objectOriented;

import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class Demo1 {

	public static void main(String[] args) {
		
		int ace=1;
		int jack=11;
		int king=13;
		int []num= {2,9,ace,jack,6};
		String [] st = {"3+heart","9+diamond","1+spades","11+heart","King+club","1+club",};
		Utility.insertionSort(st);
		
	}
}
