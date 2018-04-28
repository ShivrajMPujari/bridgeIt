package com.bridgeIt.designPattern.VisitorPattern;

public class Keyboard implements ComputerParts {

	@Override
	public void accept(ComputerPartsVistor visitor) {
		
		visitor.visit(this);
	}

}
