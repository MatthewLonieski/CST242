package sampleCode1;

import college.Name;

public class Faculty extends Person {

	private double salary;

	public Faculty(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Faculty(String firstName, char middleInitial, String lastName) {
		super(firstName, middleInitial, lastName);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	//Overriding the parent's commute() method
	public void commute() {
		System.out.println("Walk to school...");
	}

	@Override
	public String toString() {
		return super.toString() + ", salary=" + salary;
	}

}
