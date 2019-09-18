package behavioural.design.pattern.test;

import behavioural.design.pattern.context.Animal;
import behavioural.design.pattern.context.Bird;
import behavioural.design.pattern.context.Dog;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Dog();
		Animal bird = new Bird();
		
		System.out.println("dog "+dog.tryToFly());
		System.out.println("bird "+bird.tryToFly());
	}

}
