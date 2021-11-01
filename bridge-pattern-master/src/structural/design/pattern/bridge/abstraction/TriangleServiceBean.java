package structural.design.pattern.bridge.abstraction;

import structural.design.pattern.bridge.implementor.ColorService;

public class TriangleServiceBean extends ShapeService {

	public TriangleServiceBean(ColorService colorService) {
		super(colorService);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		colorService.applyColor();
	} 

}