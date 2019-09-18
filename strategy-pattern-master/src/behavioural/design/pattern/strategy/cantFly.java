package behavioural.design.pattern.strategy;


public class cantFly implements Flys{

	@Override
	public String fly() {
		return "Can't fly";
	}

}
