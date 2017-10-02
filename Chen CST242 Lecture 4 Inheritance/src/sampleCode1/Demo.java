package sampleCode1;

import college.Name;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John", 'A', "Doe");
		Student s2 = new Student("Jane", "Doe");
		s1.name = new Name("X", "Y");
		s1.getName().setFirstName("Johnny");
		s1.commute();
//		s1.name = new Name("fn", "ln");
		s1.setGpa(3.0);
		s2.setGpa(4.0);
		System.out.println(s1);
		System.out.println(s2);
		
		Faculty f1 = new Faculty("Adam", "Smith");
		Faculty f2 = new Faculty("Billy", 'B', "Joe");
		f2.commute();
		f1.setSalary(1000.00);
		f2.setSalary(2000.00);
		System.out.println(f1);
		System.out.println(f2);
		
		Person p1 = new Person("A", "B");
		p1.commute();
		p1.setName(new Name("D", "F"));
		
	}

}
