package structural.design.pattern.bridge.abstraction;

import structural.design.pattern.bridge.implementor.ColorService;

public abstract class ShapeService {
	
	// Composition - implementor
	protected ColorService colorService;
	
	// Constructor with implementor as input argument
	public ShapeService(ColorService colorService){
		this.colorService = colorService;
	}
	
	abstract public void applyColor();
}