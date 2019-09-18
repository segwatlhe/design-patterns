package client;

import factory.AbstractFactory;

public class Client {  
	// Running the Client class as application. 
	
		// Running the Client class as application. 
		public static void main(String[] args) {  
			// Getting a factory object. 
			AbstractFactory factory = AbstractFactory.getInstance(); 
			
			System.out.println("Creating a family of objects:");
			
			factory.createProductA(); 
			factory.createProductB(); 
			factory.createProductC();
			
			System.out.println("Family of objects created."); 
			} 
		} 
	