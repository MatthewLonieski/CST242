package interface4ducks;

public class RedheadDuck extends Duck implements Flyable{

	@Override
	public void display() {
		System.out.println("Showing a redhead duck.");
	}

	@Override
	public void fly() {
		System.out.println("Fly...");
	}
}
