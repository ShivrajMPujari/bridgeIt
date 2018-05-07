package com.bridgeIt.designPattern.Singleton;

public class EagerInitializedSingleton {

	 private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	    
	    //private constructor to avoid client applications to use constructor
	    private EagerInitializedSingleton(){}

	    public static EagerInitializedSingleton getInstance(){
	        return instance;
	    }
	public static void main(String[] args) {
		EagerInitializedSingleton singleton=new EagerInitializedSingleton();
		EagerInitializedSingleton singleton1=new EagerInitializedSingleton();
		System.out.println(singleton);
		System.out.println(singleton1);
	}
}
