package structural.design.pattern.bridge.abstraction;

import structural.design.pattern.bridge.implementor.Color;

public class Triangle extends Shape{

	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	} 

}