package com.bridgeIt.designPattern.FacadeDesignPattern;

public class ShapeMaker {

	Shape make;
	
	void drawCircle(){
		
		Shape make=new Circle();
		make.draw();
	}
	
	void drawRectangle(){
			
			Shape make=new Rectangle();
			make.draw();
		}
	
	void drawSquare(){
		
		Shape make=new Square();
		make.draw();
	}
	
}
