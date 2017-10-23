package duckExample;

public class Demo {

	public static void main(String[] args) {
		MallardDuck md = new MallardDuck("Donald", 0);
		md.fly();
		md.quack();
		RubberDuckie rd = new RubberDuckie("Robert", 1);
		rd.quack();
	}

}
