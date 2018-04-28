package com.bridgeIt.designPattern.VisitorPattern;

public interface ComputerParts {

	void accept(ComputerPartsVistor visitor);
}
