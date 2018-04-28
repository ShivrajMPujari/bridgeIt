package com.bridgeIt.designPattern.VisitorPattern;

public class Monitor implements ComputerParts {

	@Override
	public void accept(ComputerPartsVistor visitor) {
		visitor.visit(this);
	}

}
