package interface4ducks;

public class Demo {

	public static void main(String[] args) {
		MallardDuck m1 = new MallardDuck();
		
		m1.quack();
		m1.display();
		m1.fly();
		
		RedheadDuck r1 = new RedheadDuck();
		
		r1.quack();
		r1.display();
		r1.fly();
		
		RubberDuckie rd1 = new RubberDuckie();
		rd1.quack();
		rd1.display();
		
		
	}

}
