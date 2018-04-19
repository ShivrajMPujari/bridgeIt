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
			int count=findBTS(num);
			System.out.println(count);
		}
}
	   public static int findBTS(int num)
	    {
	        //(2n)!/(n+1)!*n!
	        //2nCn
	        int n=2*num;//2n
	        int k=num;//n
	        int value=1;
	        int result=0;
	         // [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]
	            for(int i=0;i<k;i++)
	            {
	                value*=(n-i);
	                value/=(i+1);
	            }
	           
	        // return 2nCn/(n+1)
	        result=value/(num+1);
	        return result;
	}	
	
}
