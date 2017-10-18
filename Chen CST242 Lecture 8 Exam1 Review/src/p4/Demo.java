package p4;

import p2.*;

public class Demo {

	public static void main(String[] args) {
		Course c1 = new Course("CST112", new Student("Adam", 3.5), new Faculty("Zack", 10));
		Course c2 = new Course("CST141", new Student("Bill", 4.0), new Faculty("Wakefield", 20));
		Course c3 = new Course("CST242", new Student("Cathy", 3.0), new Faculty("Chen", 5));
		CourseBag theBag = new CourseBag(3);
		theBag.insert(c1);
		theBag.insert(c2);
		theBag.insert(c3);
//		System.out.println(theBag.findCourseWithHighestGPA());
		theBag.removeCourseWithHighestSalary();
		theBag.display();

	}

}
