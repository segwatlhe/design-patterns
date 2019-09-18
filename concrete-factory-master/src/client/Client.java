package client;

import factory.Factory1;

public class Client {  
	// Running the Client class as application. 
	public static void main(String[] args) {  
		
		System.out.println("Creating an order object:"); 
		Factory1.createOrder(); 
		
		System.out.println("Creating a product object:"); 
		Factory1.createProduct(); 
		} 
	
	
	/**
	 * 
	 * Variant 2: Concrete Factory Creating (a family of) objects. 
	 * • Interface and implementation are not cleanly separated. 
	 * • The concrete Factory1 class acts as both interface and implementation (it abstracts and implements object creation). 
	 * • This is a common way to implement the Abstract Factory pattern for applications that do not need to create families of objects but want to be independent of how their objects are created (see Sample Code / Example 2).
	 * • "Also note that MazeFactory is not an abstract class; thus it acts as both the AbstractFactory and the ConcreteFactory. This is another common implementation for simple applications of the Abstract Factory pattern." [GoF, p94] 
	 * • "Notice that the [concrete] MazeFactory is just a collection of factory methods. This is the most common way to implement the Abstract Factory pattern." [GoF, p94]
	 */
	
	} 
