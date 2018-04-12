package com.bridgeIt.algorithmsPrograms;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.bridgeIt.utility.Utility;

public class Demo2 {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("//home/bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//UnorderedFileOut.txt");
			PrintWriter pw=new PrintWriter(fw);
			pw.print("hello world");
			
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
					
		
		
	}
	
}
