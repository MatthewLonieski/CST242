package p2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Student s = new Student("John", 2.5);
		s.setGpa(5.0);
		
		s.setName("Bill");
		System.out.println(s);
	}

}
