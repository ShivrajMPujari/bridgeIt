package com.bridgeIt.designPattern.ObserverDesignPattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();

	      
	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      HexaObserver hex= new HexaObserver(subject);
	      hex.update();
	      OctalObserver octal=new OctalObserver(subject);
	      octal.update();
	      BinaryObserver binary= new BinaryObserver(subject);
	      binary.update();
	      System.out.println("Second state change: 10");
	      
	      subject.setState(10);
	      HexaObserver hex1= new HexaObserver(subject);
	      hex1.update();
	      OctalObserver octal1=new OctalObserver(subject);
	      octal1.update();
	      BinaryObserver binary1= new BinaryObserver(subject);
	      binary1.update();
	}
}
