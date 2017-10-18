package college;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John", "Doe");
		Student s2 = new Student("John", 'A', "Doe");
		Student[] students = {s1, s2};
		
		Classroom r212 = new Classroom("R212", 27, true);
		
		Textbook t1 = new Textbook("Intro to Programming", 149.99);
		
		Faculty f1 = new Faculty("Ben", "Chen");
		
		Course c1 = new Course("Advanced Programming", "CST242");
		Course c2 = new Course("Primitive Programming", "CST112");
		
		c1.setFaculty(f1);
		c1.getFaculty().getName().setFirstName("Joe");
		
		c2.setFaculty(f1);
		
		System.out.println(s1.getId());
		System.out.println(s2.getId());
	}

}
