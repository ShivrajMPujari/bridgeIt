package com.bridgeIt.designPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private int state;
	private List<Observer> Observers= new ArrayList<Observer> ();
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
	 public void attach(Observer observer){
	      Observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : Observers) {
	         observer.update();
	      }
}
	   }
