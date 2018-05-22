package com.bridgeIt.objectOriented.stocksProcessing.objectOriented;

public class Company {

	private	String symbol;
	private long shares;
	private	long sharePerPrice;
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public long getShares() {
		return shares;
	}
	public void setShares(long shares) {
		this.shares = shares;
	}
	public long getSharePerPrice() {
		return sharePerPrice;
	}
	public void setSharePerPrice(long sharePerPrice) {
		this.sharePerPrice = sharePerPrice;
	}
	
}
