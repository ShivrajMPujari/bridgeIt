
package com.bridgeIt.objectOriented;

import com.bridgeIt.utility.Utility;

/** Write a program to read in Stock Names, Number of Share, Share Price.
 *  Print a Stock Report with total value of each Stock and the total value of Stock.
 * @author Shivraj Pujari
 * @version 1.0
 * @since   2-5-2018
 */
public class StockPortfolio {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws CloneNotSupportedException {
		
		StockClone stockObject= new StockClone();
		System.out.println("Enter the number of stocks");
		int stocksNumber=Utility.inputInt();
		for (int i = 1; i <=stocksNumber ; i++) {
			System.out.println(stocksNumber);
			stockObject.addStock();	
		}
		Utility util =new Utility();
		System.out.println("Stock report:-");
		System.out.println("--------------------------------------------------------------------------------------------------");
		util.readStock(StockClone.LIST);
		
		
	}
	
}
