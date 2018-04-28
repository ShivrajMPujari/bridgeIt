package com.bridgeIt.designPattern.VisitorPattern;

public interface ComputerPartsVistor {

	public ComputerPartsVistor visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
