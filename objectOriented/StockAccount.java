package com.bridgeIt.objectOriented;

import java.io.File;
import java.io.IOException;

import com.bridgeIt.utility.Utility;

public class StockAccount {

	
	Integer shares;
	Integer totalSharePrice;
	CompanyList list;
	StockAccount(String files){
		
		File file= new File("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//files//sharePerson//"+files+".json");
		if(file.exists()!=true){
			
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		list=new CompanyList();
	}
	
	public double valueOf(){
			
		return totalSharePrice;
		
	}
	
	public void buy(int amount, String symbol){
		
	list.addAmount(symbol, amount);
			
	}
	
	public void sell(int amount, String symbol){
		
		list.remove(symbol, amount);
		

	}
	public void save(String filename){
		
		
	}
	
	public void printReport(){
		
		list.display();
	}
	

	
	public static void main(String[] args) {
		System.out.println("Enter the name of account");
		String files=Utility.inputString();
		StockAccount stocks=new StockAccount(files);
		stocks.buy(1200, "tata");
		stocks.buy(3000, "tata");
		stocks.buy(2500, "rel");
		stocks.buy(2500, "rel");
		stocks.buy(5000, "indianoil");
		stocks.buy(5000, "indianoil");
		stocks.printReport();
		stocks.sell(2000, "tata");
		stocks.sell(2000, "rel");
//		stocks.sell(2000, "indianoil");
		stocks.printReport();
	}
	
	
	
	}
