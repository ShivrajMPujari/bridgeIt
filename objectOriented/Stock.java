package com.bridgeIt.objectOriented;

import java.util.ArrayList;

public class Stock implements Cloneable{

	static ArrayList LIST= new ArrayList();
	String stockName;
	Integer shareNumber;
	Integer sharePrice;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
}
