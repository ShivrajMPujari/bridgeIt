package com.bridgeIt.dataStructures;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


import com.bridgeIt.utility.Utility;

public class Demo4 {

	public static <T extends Comparable<T>> void printData(String file,T data){
		
		FileWriter filewrite;
		PrintWriter printwrite;
		try {

			filewrite = new FileWriter("//home/bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//"+file+"",true);
			printwrite=new PrintWriter(filewrite);
			
			printwrite.print(""+data+" ");
			printwrite.flush();
			printwrite.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	
	
	public static void main(String[] args) {
	
		
		Utility.printData("HashingOut.txt", 2345);
		String [] str=Utility.readFile("HashingOut.txt");
		System.out.println(Arrays.toString(str));
	//	d.printData("HashingOut.txt", 244);
		
		
	}
	
}
