package behavioural.design.pattern.context;

import behavioural.design.pattern.strategy.cantFly;

public class Dog extends Animal {

	public Dog() {
		// TODO Auto-generated constructor stub
		flys = new cantFly();
	}

}
