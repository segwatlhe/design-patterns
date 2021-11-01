package structural.design.pattern.bridge.implementor;


public class GreenColorServiceBean implements ColorService{

	public void applyColor(){
		System.out.println("green.");
	}
}