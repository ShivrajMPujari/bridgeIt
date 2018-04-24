package com.bridgeIt.designPattern.Singleton;

public class Demo2 implements Runnable {

	static ThreadSafeSingleton THREAD3=null;
	public void run() {
		 THREAD3=ThreadSafeSingleton.getInstance();
		 System.out.println(THREAD3);
		 
	}
}
