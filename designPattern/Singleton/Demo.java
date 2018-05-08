package com.bridgeIt.designPattern.Singleton;

public class Demo implements Runnable {
	static ThreadSafeSingleton THREAD1=null;
	public void run() {
		
		 THREAD1=ThreadSafeSingleton.getInstance();
		 System.out.println(THREAD1);
		 
	}

	public static void main(String[] args) {
		
		
	/*	EagerInitializedSingleton singleton1=EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton singleton2=EagerInitializedSingleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);*/
		
		
	/*	StaticBlockSingleton block=StaticBlockSingleton .getInstance();
		StaticBlockSingleton block1=StaticBlockSingleton.getInstance();
		System.out.println(block);
		System.out.println(block1);*/
		
		/*LazyInitializedSingleton lazyInstance=LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton lazyInstance1=LazyInitializedSingleton.getInstance();
		System.out.println(lazyInstance);
		System.out.println(lazyInstance1);*/
		
	/*	Demo d1= new Demo();
		Thread t1= new Thread(d1);
		t1.start();
		Demo2 d2=new Demo2();
		Thread t2= new Thread(d2);
		t2.start();
		
		*/
	}

}
