package factory;

import product1.ProductA;
import product1.ProductA2;
import product2.ProductB;
import product2.ProductB2;
import product3.ProductC;
import product3.ProductC2;

//Concrete Factory
public class Factory2  extends AbstractFactory {

	@Override
	public ProductA createProductA() {
		System.out.println("  creating a ProductA2 object ..."); 
		return new ProductA2(); 
	}

	@Override
	public ProductB createProductB() {
		System.out.println("  creating a ProductB2 object ..."); 
		return new ProductB2(); 
	}

	@Override
	public ProductC createProductC() {
		System.out.println("  creating a ProductC2 object ..."); 
		return new ProductC2();
	}

}
