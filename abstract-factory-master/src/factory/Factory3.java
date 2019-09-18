package factory;

import product1.ProductA;
import product1.ProductA3;
import product2.ProductB;
import product2.ProductB3;
import product3.ProductC;
import product3.ProductC3;

//Concrete Factory
public class Factory3  extends AbstractFactory {

	@Override
	public ProductA createProductA() {
		System.out.println("  creating a ProductA3 object ..."); 
		return new ProductA3(); 
	}

	@Override
	public ProductB createProductB() {
		System.out.println("  creating a ProductB3 object ..."); 
		return new ProductB3(); 
	}

	@Override
	public ProductC createProductC() {
		System.out.println("  creating a ProductC3 object ..."); 
		return new ProductC3();
	}

}
