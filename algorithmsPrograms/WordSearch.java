package com.bridgeIt.algorithmsPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class WordSearch {

	public static void main(String[] args) {
		///home/bridgeit/Downloads/shiv/ExpCode/src/com/bridgelabz/algorithms/d
		
		try {
			FileReader fr = new FileReader("//home//bridgeit//Downloads//shiv//ExpCode//src//com//bridgelabz//algorithms//demo.txt");
			BufferedReader br = new BufferedReader(fr);
			String st=br.readLine();
			
			System.out.println(st);
		    String [] s=st.split("\\s");
		   // System.out.println(Arrays.toString(s));
		    
		    String [] s1=Utility.wordSort(s);
		    System.out.println(Arrays.toString(s1));
			System.out.println("enter the word to search");
			
			String word=Utility.inputString();
			
			Utility.binarySearchString(s1, 0, s1.length, word);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
