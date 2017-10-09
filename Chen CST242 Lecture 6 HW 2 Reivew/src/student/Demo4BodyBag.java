package student;

public class Demo4BodyBag {

	public static void main(String[] args) {
		BodyBag theBag = new BodyBag(10);
		Student s1 = new Student("Johnny", 20, 3, 100, 0, 0, 100);
		theBag.insert(s1);
		Student s2 = new Student("Suzy", 20, 1, 100, 100, 50, 100);
		theBag.insert(s2);
		Student s3 = new Student("Joey", 20, 10, 100, 100, 100, 100);
		theBag.insert(s3);
		theBag.display();
		System.out.println("-------");
		System.out.println(theBag.findByName("Suzy").getGrades().getFinalExam().getGrammar());
		System.out.println("--------");
		System.out.println(theBag.removeByName("Suzy"));
		System.out.println("--------");
		theBag.display();
	}

}
