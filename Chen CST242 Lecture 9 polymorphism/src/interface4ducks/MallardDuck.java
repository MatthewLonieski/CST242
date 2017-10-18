package interface4ducks;

public class MallardDuck extends Duck implements Flyable {

	@Override
	public void display() {
		System.out.println("Showing a mallard duck.");
	}

	@Override
	public void fly() {
		System.out.println("Fly...");
	}

}
