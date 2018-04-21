/* 
 *  Purpose:Binary search tree to find number for nodes by checking test case
 * 	@author  Shivraj Pujari
 *  @version 1.0
 *  @since   19-4-2018
 * 
 * */

package com.bridgeIt.dataStructures;

import com.bridgeIt.utility.Utility;

public class BinaryTree {

	public static void main(String[] args) {
		System.out.println("Enter the No. of TestCases");
		int tc=Utility.inputInt();
		int num=0;
		for(int i=0;i<tc;i++)
		{
			System.out.println("Enter Your Node Number:");
			num=Utility.inputInt();
			double count=Utility.binarySearchTree(num);
			System.out.println(count);
		}
			}
}
