package college;

public class Demo3 {
	public static void main(String[] args) {
//		double d = 10.5;
//		int i = 1;
//		d = i;
//		i = (int)d;
		
		Student s1 = new Student("Adam", "Smith");
		Faculty f1 = new Faculty("Ben", "Chen");
		Student s2 = new Student("A", "Smith");
		Faculty f2 = new Faculty("B", "Chen");
		Student s3 = new Student("M", "Smith");
		Faculty f3 = new Faculty("N", "Chen");
		
		PersonBag theBag = new PersonBag(10);
		theBag.insert(f2);
		theBag.insert(s1);
		s1.setGpa(2.5);
		theBag.insert(f3);
		theBag.insert(s3);
		s3.setGpa(3.2);
		theBag.insert(f1);
		theBag.insert(s2);
		s2.setGpa(4.0);
		
		System.out.println(theBag.findPersonById("00000002").getClass());
//		System.out.println(theBag.findStudentWithHighestGPA());
		
	}
}
