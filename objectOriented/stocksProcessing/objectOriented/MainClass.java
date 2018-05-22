package com.bridgeIt.objectOriented.stocksProcessing.objectOriented;

import com.bridgeIt.utility.Utility;

public class MainClass {

	
	public static void main(String[] args) {

		StockAccount stock=new StockAccount();
		 System.out.println("Enter Your Choice");
	        System.out.println("1.Create a new Account\n2.Buy Shares\n3.Sell Shares\n4.Print Report\n5.Edit CompanyShare");
	        int choice=Utility.inputInt();
	        switch(choice)
	        {
	        case 1:{
	        	System.out.println("Creating Account");
	        	System.out.println("Enter the name of the account");
	        	String file=Utility.inputString();
	        	stock.createFile(file);
             break;
	        } 
	        case 2:{ System.out.println("You are buying Shares");
        
         break;
         }
	        case 3:{System.out.println("You are selling shares");
       
         break;
         } 
	        case 4:{System.out.println("Print Report");
         
         break;
         } 
		
	}
	}
}
