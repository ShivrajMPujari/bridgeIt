package com.bridgeIt.objectOriented;

import java.util.ArrayList;

public class StockPortfolio {

	
	public void readStock(ArrayList list){
		list=StockClone.LIST;
		
		for (Object object : list) {
			
			Stock stock =(Stock)object;
			System.out.println(stock.stockName+" "+stock.shareNumber+" "+stock.sharePrice);
			
		}
		
	}
	
	
}
