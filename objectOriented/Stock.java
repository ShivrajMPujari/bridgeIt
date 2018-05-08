package com.bridgeIt.objectOriented;

import java.util.ArrayList;

public class Stock implements Cloneable{

	static ArrayList<Stock> LIST= new ArrayList<Stock>();
	public String stockName;
	public Integer shareNumber;
	public Integer sharePrice;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
}
