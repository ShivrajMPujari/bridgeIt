package com.bridgeIt.designPattern.FacadeDesignPattern;

public class FacadeDesign {

	public static void main(String[] args) {
		
		ShapeMaker shape=new ShapeMaker();
		shape.drawCircle();
		shape.drawRectangle();
		shape.drawSquare();
	}
}
