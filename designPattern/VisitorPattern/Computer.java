package com.bridgeIt.designPattern.VisitorPattern;

public class Computer implements ComputerParts{

	ComputerParts[] parts;
	
	public Computer(){
		
		parts=new ComputerParts[]{new Keyboard(),new Monitor(),new Mouse()};
		
	}
	@Override
	public void accept(ComputerPartsVistor visitor) {
		
		for (int i = 0; i < parts.length; i++) {
		
			parts[i].accept(visitor);
		}
		visitor.visit(this);
	}

}
