
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
			
			//using filereader and bufferedreader to store the list of words from a file
			FileReader fr = new FileReader("//home//bridgeit//Downloads//shiv//ExpCode//src//com//bridgelabz//algorithms//demo.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String st=br.readLine();						//read the file in a line  
			
			System.out.println(st);
		    String [] s=st.split("\\s");					//Splitting a string to string array
		   
		    String [] s1=Utility.wordSort(s);   			//sorting the words
		    System.out.println(Arrays.toString(s1));
			System.out.println("enter the word to search");
			
			String word=Utility.inputString();				//taking users input
			
			/* Function to search the element
			 * @param String s1 ,starting index ,end index, word
			 * */
			Utility.binarySearchString(s1, 0, s1.length, word);		
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
