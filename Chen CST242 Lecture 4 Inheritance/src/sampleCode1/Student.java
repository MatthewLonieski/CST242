package sampleCode1;

import college.Name;

public class Student extends Person{
	
	private double gpa;

	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Student(String firstName, char middleInitial, String lastName) {
		super(firstName, middleInitial, lastName);
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void commute() {
		System.out.println("Take a bus to school...");
	}

	@Override
	public String toString() {
		return super.toString() + ", gpa=" + gpa;
	}



}
