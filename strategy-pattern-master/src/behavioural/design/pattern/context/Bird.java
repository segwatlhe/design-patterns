package behavioural.design.pattern.context;

import behavioural.design.pattern.strategy.itFlys;

public class Bird extends Animal{

	public Bird() {
		// TODO Auto-generated constructor stub
		flys = new itFlys();
	}

}
