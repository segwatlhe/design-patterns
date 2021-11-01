package structural.design.pattern.bridge.test;

import structural.design.pattern.bridge.abstraction.PentagonServiceBean;
import structural.design.pattern.bridge.abstraction.ShapeService;
import structural.design.pattern.bridge.abstraction.TriangleServiceBean;
import structural.design.pattern.bridge.implementor.GreenColorServiceBean;
import structural.design.pattern.bridge.implementor.RedColorServiceBean;

public class BridgePatternTest {

	public static void main(String[] args) {
		
		ShapeService triangleService = new TriangleServiceBean(new RedColorServiceBean());
		triangleService.applyColor();
		
		ShapeService pentagonService = new PentagonServiceBean(new GreenColorServiceBean());
		pentagonService.applyColor();
	}

}