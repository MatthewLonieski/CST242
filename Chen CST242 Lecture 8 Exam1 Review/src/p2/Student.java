package p2;

public class Student extends Person {
	private double gpa;

	public Student(String name, double gpa) {
		super(name);
		this.gpa = gpa;
	}

	public Student (Student student) {
		super(student.getName());
		setId(student.getId());
		this.gpa = student.gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return super.toString() + ", gpa=" + gpa;
	}
	
	

}
