package factory;

import product.Order;
import product.Order1;
import product.Product;
import product.Product1;

//For simple applications that do not need to create families of objects but want to separate and centralize object creation.
public class Factory1 {

	public static Order createOrder() {
		System.out.println("  Order1 object created.");
		return new Order1();
	}

	public static Product createProduct() {
		System.out.println("  Product1 object created.");
		return new Product1();
	}

}
//Concrete Factory 