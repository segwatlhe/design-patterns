package structural.design.pattern.bridge.abstraction;

import structural.design.pattern.bridge.implementor.Color;

public abstract class Shape {
	//Composition - implementor
	protected Color color;
	
	//constructor with implementor as input argument
	public Shape(Color c){
		this.color=c;
	}
	
	abstract public void applyColor();
}