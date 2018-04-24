package com.bridgeIt.designPattern.Singleton;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton INSTANCE;
	
	private LazyInitializedSingleton() {
		
	}
	
	public static LazyInitializedSingleton getInstance(){
		
		if (INSTANCE==null){
			
			INSTANCE=new LazyInitializedSingleton();
			return INSTANCE;
		}
		
		return INSTANCE;
	}
}
