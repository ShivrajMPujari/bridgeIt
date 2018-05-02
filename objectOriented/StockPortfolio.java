

package com.bridgeIt.objectOriented;

import java.util.ArrayList;

import com.bridgeIt.utility.Utility;

public class StockPortfolio {

	
	/**Function reads the list and prints the content inside the list
	 * @param list ArrayList contains the data of stock
	 */
	public void readStock(ArrayList<Stock> list){
		
		
		for (Object object : list) {
			
			Stock stock =(Stock)object;
			System.out.println("Stock Name- "+stock.stockName+" | No.s of Stocks- "+stock.shareNumber+" | Unit Stock Price "+stock.sharePrice+" | Total value- "+(stock.shareNumber*stock.sharePrice));
			
		}
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws CloneNotSupportedException {
		
		StockClone stockObject= new StockClone();
		System.out.println("Enter the number of stocks");
		int stocksNumber=Utility.inputInt();
		for (int i = 1; i <=stocksNumber ; i++) {
			System.out.println(stocksNumber);
			stockObject.addStock();
			
		}
		
		StockPortfolio StockPortfolio= new StockPortfolio();
		System.out.println("Stock report:-");
		System.out.println("--------------------------------------------------------------------------------------------------");
		StockPortfolio.readStock(StockClone.LIST);
		
		
	}
	
}
