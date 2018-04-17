
/* 
 *  Purpose:Read in a list of words from File. Then prompt the user to enter a word to search the list.
 *  		The program reports if the search word is found in the list.
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   09-4-2018
 * 
 * */


package com.bridgeIt.algorithmsPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgeIt.utility.Utility;

public class WordSearch {

	public static void main(String[] args) {
		
		try {
			
			FileReader fileRead = new FileReader("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//algorithmsPrograms//demo.txt");
			BufferedReader reader = new BufferedReader(fileRead);
			
			String string=reader.readLine();						
			
			System.out.println(string);
		    String [] strArray=string.split("\\s");					
		   
		    String [] strArray1=Utility.wordSort(strArray);   			
		    System.out.println(Arrays.toString(strArray));
			System.out.println("enter the word to search");
			
			String word=Utility.inputString();				
			
			Utility.binarySearch(strArray1, word);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
