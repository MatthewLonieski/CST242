package p2;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John", 4.0);
		Faculty f1 = new Faculty("Chen", 10.00);
		Course c1 = new Course("CST242", s1, f1);
		System.out.println(c1);
		f1.setName("John Doe");
		System.out.println(f1);
	}

}
