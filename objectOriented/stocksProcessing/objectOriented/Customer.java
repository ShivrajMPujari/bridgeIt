package com.bridgeIt.objectOriented.stocksProcessing.objectOriented;

public class Customer {

	private	String name;
	private	long balance;
	private long shareCount;

	public long getShareCount() {
		return shareCount;
	}
	public void setShareCount(long shareCount) {
		this.shareCount = shareCount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

}
