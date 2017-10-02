package bodyBag;

public class Demo {

	public static void main(String[] args) {
		BodyBag theBag = new BodyBag(10);
		theBag.insert(new Student("Andrew", 80, 100));
		theBag.insert(new Student("Bill", 90, 70));
		theBag.insert(new Student("Cathy", 60, 90));
		theBag.display();
//		System.out.println(theBag.removeByName("Andrew"));
//		System.out.println(theBag.removeByName("Andrew"));
		System.out.println("------");
		System.out.println(theBag.findHighestMidTermScore());
		System.out.println(theBag.findHighestFinalScore());
		
	}

}
