package structural.design.pattern.bridge.test;

import structural.design.pattern.bridge.abstraction.Pentagon;
import structural.design.pattern.bridge.abstraction.Shape;
import structural.design.pattern.bridge.abstraction.Triangle;
import structural.design.pattern.bridge.implementor.GreenColor;
import structural.design.pattern.bridge.implementor.RedColor;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}