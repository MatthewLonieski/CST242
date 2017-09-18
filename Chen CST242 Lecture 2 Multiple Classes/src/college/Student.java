package college;

public class Student {
	private Name name;
	private int id;
	private double gpa;
	
	private static int idCounter = 0;

	public Student(String firstName, String lastName) {
		idCounter++;
		id = idCounter;
		name = new Name(firstName, lastName);
	}

	public Student(String firstName, char middleInitial, String lastName) {
		idCounter++;
		id = idCounter;
		name = new Name(firstName, middleInitial, lastName);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
