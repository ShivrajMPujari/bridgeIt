package com.bridgeIt.designPattern.VisitorPattern;

public class VisitorMain {

	public static void main(String[] args) {

		ComputerParts computer = new Computer();
	      computer.accept(new ComputerPartsVisitorDisplay());
		

	}

}
