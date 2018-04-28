package com.bridgeIt.designPattern.VisitorPattern;

public class ComputerPartsVisitorDisplay implements ComputerPartsVistor{

	@Override
	public void visit(Computer computer) {
		System.out.println(" display all parts");
		
	}

	@Override
	public void visit(Mouse mouse) {
	
		System.out.println("Displaying mouse");
		
	}

	@Override
	public void visit(Keyboard keyboard) {
	
		System.out.println("Displaying Keyboards");
	}

	@Override
	public void visit(Monitor monitor) {
		
		System.out.println("Displaying monitors");
	}

}
