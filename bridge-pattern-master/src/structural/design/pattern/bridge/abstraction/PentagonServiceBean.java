package structural.design.pattern.bridge.abstraction;

import structural.design.pattern.bridge.implementor.ColorService;

public class PentagonServiceBean extends ShapeService {

	public PentagonServiceBean(ColorService colorService) {
		super(colorService);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		colorService.applyColor();
	} 

}