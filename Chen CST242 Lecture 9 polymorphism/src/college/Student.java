package college;

public class Student extends Person {
	private double gpa;
	
	Student(String firstName, char middleInitial, String lastName) {
		super(firstName, middleInitial, lastName);
	}

	Student(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return super.toString() + ", GPA=" + gpa;
	}
	
	

	

}
