package ducks;

public class Demo {

	public static void main(String[] args) {
		MallardDuck m1 = new MallardDuck();
		m1.fly();
		m1.quack();
		m1.display();
		
		RedheadDuck r1 = new RedheadDuck();
		r1.fly();
		r1.quack();
		r1.display();
		
		RubberDuckie rd1 = new RubberDuckie();
		rd1.quack();
		rd1.display();
		rd1.fly();
	}

}