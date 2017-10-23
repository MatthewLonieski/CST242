package duckExample;

public class RubberDuckie extends Duck implements Quackable{

	public RubberDuckie(String name, int id) {
		super(name, id);
	}
	
	@Override
	public void quack() {
		System.out.println("Squeak....");
	}

}
