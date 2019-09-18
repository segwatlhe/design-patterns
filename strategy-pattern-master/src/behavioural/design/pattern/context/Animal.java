package behavioural.design.pattern.context;

import behavioural.design.pattern.strategy.Flys;

public class Animal {

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	
	public Flys flys;
	
	public String tryToFly() {
		return flys.fly();
	}
	
//	public void setFlyingAbility(Flys fly) {
	//	flys = fly;
	//}
	
}
