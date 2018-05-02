package com.bridgeIt.objectOriented;

import java.util.ArrayList;

import com.bridgeIt.utility.Utility;

public class StockClone {
	
	static ArrayList<Stock> LIST= new ArrayList<Stock>();
	Stock stock= new Stock();
	
	/**Function makes the clone of the Stock class 
	 * @return cloned object of class Stock
	 * @throws CloneNotSupportedException
	 */
	public Stock makeStock() throws CloneNotSupportedException{
	
	Stock stock1=(Stock) stock.clone();
		
		return stock1;
	}
	
	
	/**Function sets the attributes of the Stock 
	 * @param stock Stock class reference
	 * @return Stock object reference
	 */
	public Stock setStock(Stock stock){
		
		System.out.println("Enter the stock name");
		
		stock.stockName=Utility.inputString();
		
		System.out.println("Enter the number of shares");
		stock.shareNumber=Utility.inputInt();
		
		System.out.println("Enter the price of one share ");
		stock.sharePrice=Utility.inputInt();
		
		return stock;
		
	}
	
	/**Function adds the stock object to the list
	 * @throws CloneNotSupportedException
	 */
	public void addStock() throws CloneNotSupportedException{
		
		Stock newStock =makeStock();
		newStock=setStock(newStock);
		LIST.add(newStock);
	}
	
}
