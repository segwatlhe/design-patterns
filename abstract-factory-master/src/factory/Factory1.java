package factory;

import product1.ProductA;
import product1.ProductA1;
import product2.ProductB;
import product2.ProductB1;
import product3.ProductC;
import product3.ProductC1;

//Concrete Factory
public class Factory1  extends AbstractFactory {

	@Override
	public ProductA createProductA() {
		System.out.println("  creating a ProductA1 object ..."); 
		return new ProductA1(); 
	}

	@Override
	public ProductB createProductB() {
		System.out.println("  creating a ProductB1 object ..."); 
		return new ProductB1(); 
	}

	@Override
	public ProductC createProductC() {
		System.out.println("  creating a ProductC1 object ..."); 
		return new ProductC1();
	}

}
