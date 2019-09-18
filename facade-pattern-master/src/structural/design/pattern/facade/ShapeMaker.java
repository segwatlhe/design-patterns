package structural.design.pattern.facade;

import structural.design.pattern.subsystems.Circle;
import structural.design.pattern.subsystems.Rectangle;
import structural.design.pattern.subsystems.Shape;
import structural.design.pattern.subsystems.Square;

public class ShapeMaker {
	
	   private Shape circle;
	   private Shape rectangle;
	   private Shape square;

	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }
	}