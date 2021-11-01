package structural.design.pattern.bridge.implementor;

public class RedColorServiceBean implements ColorService{

	public void applyColor(){
		System.out.println("red.");
	}
}