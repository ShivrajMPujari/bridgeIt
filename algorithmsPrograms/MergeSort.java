package com.bridgeIt.algorithmsPrograms;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.bridgeIt.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {

		System.out.println("enter the strings ");
		String str=Utility.inputStringLong();
		System.out.println(str);
		String strArray[]=str.split("\\s");
		Utility.mergeSort(strArray,0,strArray.length-1);
	}

}
