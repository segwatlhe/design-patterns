package structural.design.pattern.client;

import structural.design.pattern.facade.ShapeMaker;

public class Test {

	   public static void main(String[] args) {
		      ShapeMaker shapeMaker = new ShapeMaker();

		      shapeMaker.drawCircle();
		      shapeMaker.drawRectangle();
		      shapeMaker.drawSquare();		
		   }
}
