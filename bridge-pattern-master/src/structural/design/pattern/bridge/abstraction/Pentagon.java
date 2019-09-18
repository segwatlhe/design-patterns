package structural.design.pattern.bridge.abstraction;

import structural.design.pattern.bridge.implementor.Color;

public class Pentagon extends Shape{

	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	} 

}