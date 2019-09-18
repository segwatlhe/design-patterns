package factory;

import product1.ProductA;
import product2.ProductB;
import product3.ProductC;

//controller / interface
//AbstractFactory defers creation of product objects to its ConcreteFactory subclass
public abstract class AbstractFactory {  
	
	// Implemented as Singleton. 
	// See also Singleton / Implementation / Variant 2 (subclassing). 
	private static AbstractFactory factory; 
	public static final AbstractFactory getInstance() {  
		if (factory == null) {  
			// Deciding which factory to use. 
			// For example, production or test (mock) factory. 
			factory = new Factory2(); 
			//factory = new Factory1();
			//factory = new Factory3);
			} 
		return factory; 
		} 
	// 
	public abstract ProductA createProductA(); 
	public abstract ProductB createProductB();
	public abstract ProductC createProductC();
	
	// 
	// Factory subclasses are implemented as private static nested classes 
	// to ensure that clients can't instantiate them directly. 
	// 
	/**
	 * 
	 * @author BennyS

	private static class Factory1 extends AbstractFactory {  // Family1 
		public ProductA createProductA() { 
			System.out.println("  creating a ProductA1 object ..."); 
			return new ProductA1(); 
			} 
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
		 *
	 */

}