package creditCalculator;

public class Demo {

	public static void main(String[] args) {
		Course c1 = new Course("CST111", "Intro to IT", 4);
		Course c2 = new Course("CST112", "Intro to Programming", 3);
		Course c3 = new Course("CST113", "College Seminar", 1);
		Course c4 = new Course("CST114", "Intro to IT", 2);
		Course c5 = new Course("CST115", "Intro to IT", 3);
		Course c6 = new Course("CST116", "Intro to IT", 4);
		
		CourseBag theBag = new CourseBag(10);
		theBag.insert(c1);
		theBag.insert(c2);
		theBag.insert(c3);
		theBag.insert(c4);
		theBag.insert(c5);
		theBag.insert(c6);
		
		String[] coursesTook = { "CST111", "CST112"};
		String[] coursesTaking = {"CST113", "CST114", "CST115"};
		String[] coursesToTake = {"CST116"};
		
		System.out.println("Credits took: " + CreditCalculator.getCredits(coursesTook, theBag.getCourseArray()));
		System.out.println("Credits taking: " + CreditCalculator.getCredits(coursesTaking, theBag.getCourseArray()));
		System.out.println("Credits to take: " + CreditCalculator.getCredits(coursesToTake, theBag.getCourseArray()));
		
	}

}
