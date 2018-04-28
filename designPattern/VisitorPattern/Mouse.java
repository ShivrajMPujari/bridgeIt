package com.bridgeIt.designPattern.VisitorPattern;

public class Mouse implements ComputerParts {

	@Override
	public void accept(ComputerPartsVistor visitor) {
	
		visitor.visit(this);
	}

}
