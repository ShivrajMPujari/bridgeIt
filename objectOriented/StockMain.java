package com.bridgeIt.objectOriented;

import org.json.simple.JSONObject;

import com.bridgeIt.utility.Utility;

public class StockMain {

	public static void main(String[] args) {
		
		System.out.println("Stock processing-");
		System.out.println("1.New user \n2.Existing user");
		int user=Utility.inputInt();
		if(user==1){
			
			System.out.println("Enter the name of the Account");
			String name=Utility.inputString();
			StockAccount account= new StockAccount(name);
			System.out.println("Enter the choice-\n 1. Buy the share 2.Sell the share 3.Save 4.Quit");
			int num=Utility.inputInt();
			
			int i=9;
			while(i==9){
				switch(num){
				
				case 1:{

						System.out.println("Enter the Company symbol");
						String symbol=Utility.inputString();
						System.out.println("Enter the share amount");
						int amount=Utility.inputInt();
						System.out.println("Enter the date");
						String date=Utility.inputString();
						account.buy(amount, symbol,date);
						System.out.println("Enter the choice-\n 1. Buy the share 2.Sell the share 3.Save 4.Quit");
						num=Utility.inputInt();
						break;
					}
					
				case 2:{
					
					System.out.println("Enter the Company symbol");
					String symbol=Utility.inputString();
					System.out.println("Enter the share amount");
					int amount=Utility.inputInt();
					System.out.println("enter the date");
					String date=Utility.inputString();
					account.sell(amount, symbol,date);
					System.out.println("Enter the choice-\n 1. Buy the share 2.Sell the share 3.Save 4.Quit");
					num=Utility.inputInt();
					break;
				}
				case 3:{
					
					account.save(name, account.list,account.totalSharePrice);
					System.out.println("Your data is saved");
					
					System.out.println("Enter the choice 1.display details  2.total share price");
					int option=Utility.inputInt();;
					if(option==1){
					//	account.list.display();
						account.printReport();
					}
					else if(option==2){
						System.out.println("total share price is "+account.totalSharePrice);
					}
					System.out.println("Enter the choice-\n 1. Buy the share 2.Sell the share 3.Save 4.Quit");
					num=Utility.inputInt();
					break;
				}
				case 4:{
					
					
					System.exit(0);
					break;
				}
			}
			}	

		}
		else if(user==2){
			
			System.out.println("Enter the name of the Account");
			String name=Utility.inputString();
			StockAccount account= new StockAccount(name);
			JSONObject jsonObject=account.editPerson(name);
			System.out.println(jsonObject);
			System.out.println("Enter the choice-\n 1. Buy the share 2.Sell the share 3.Save 4.Print Report");
			int num=Utility.inputInt();
			int j=9;
			while(j==9){
				
				switch(num){
				
				case 1:{
					

					System.out.println("Enter the Company symbol");
					String symbol=Utility.inputString();
					System.out.println("Enter the share amount");
					int amount=Utility.inputInt();
					account.editBuy(jsonObject, amount, symbol);
					System.out.println("Enter the choice-\n 1. Buy the share 2.Sell the share 3.Save 4.Print Report");
					num=Utility.inputInt();
					
					break;
				}
				case 2:{
					
					System.out.println("Enter the Company symbol");
					String symbol=Utility.inputString();
					System.out.println("Enter the share amount");
					int amount=Utility.inputInt();
					account.editSell(jsonObject, amount, symbol);
					System.out.println("Enter the choice-\n 1. Buy the share 2.Sell the share 3.Save 4.Print Report");
					num=Utility.inputInt();
					
					break;
				}
				case 3:{
					
					account.editPrint(jsonObject, name);
					System.out.println("Enter the choice-\n 1. Buy the share 2.Sell the share 3.Save 4.Print Report");
					num=Utility.inputInt();
					break;
				}
				case 4:{
					account.editDisplay(jsonObject);
					System.exit(0);
					break;
				}
				
				}	
				
			}
		
		}

	}
	
}
