package polymorphism;

public class Demo {

	public static void main(String[] args) {
		Pet p1 = new Pet("Max");
		Cat c1 = new Cat("Min", 5);
		Dog d1 = new Dog("Med", "Golden");
		
//		c1.show(c1);
//		d1.show(d1);
		c1.display();
		d1.display();
		
		// Polymorphism
		// A reference variable of a super class can reference
		// any object of a subclass
		Pet p2 = new Dog("dog1", "Breed1");
		Pet p3 = new Cat("cat1", 10);
		
		
	}

}
