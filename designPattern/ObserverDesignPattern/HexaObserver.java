package com.bridgeIt.designPattern.ObserverDesignPattern;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject){
		  this.subject = subject;
	      this.subject.attach(this);	
	}
	
	@Override
	public void update() {
	
		 System.out.println( "Octal String: " + Integer.toHexString(subject.getState())); 	
	}

}
