/* 
 *  Purpose:Create a Slot of 10 to store Chain of Numbers that belong to each Slot to efficiently search a number
 *  		from a given set of number
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   19-4-2018
 * 
 * */
package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class HashSearch {

	public static void main(String[] args) {

		Hashing hs=new Hashing();
		hs.hash();			
		 String [] s=Utility.readFile("HashingIn.txt");
			Integer[] in= new Integer[s.length];
		
			  for (int i = 0; i < s.length; i++) {
				  
				   in[i]=Integer.valueOf(s[i]);
				   hs.add(in[i]);
			}
			  hs.prints();
			 System.out.println("enter the number");
			 Integer data =Utility.inputInt();
			 hs.actions(data);
			 hs.prints();
			 
	}

}
