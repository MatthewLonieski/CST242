package duckExample;

public interface Flyable {
	default void fly() {
		System.out.println("Fly...");
	}

}
