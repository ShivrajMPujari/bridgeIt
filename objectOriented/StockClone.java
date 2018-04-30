package com.bridgeIt.objectOriented;

import java.util.ArrayList;

import com.bridgeIt.utility.Utility;

public class StockClone {
	
	static ArrayList<Stock> LIST= new ArrayList<Stock>();
	Stock stock= new Stock();
	
	public Stock makeStock() throws CloneNotSupportedException{
	
	Stock stock1=(Stock) stock.clone();
		
		return stock1;
	}
	
	
	public Stock setStock(Stock stock){
		
		System.out.println("Enter the stock name");
		stock.stockName=Utility.inputStringLong();
		
		System.out.println("Enter the number of shares");
		stock.shareNumber=Utility.inputInt();
		
		System.out.println("Enter the price of one share ");
		stock.sharePrice=Utility.inputInt();
		
		return stock;
		
	}
	
	public void addStock() throws CloneNotSupportedException{
		
		Stock newStock =makeStock();
		newStock=setStock(newStock);
		LIST.add(newStock);
	}
	
}
