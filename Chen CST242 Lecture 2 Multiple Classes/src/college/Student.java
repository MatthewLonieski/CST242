package college;

public class Student {
	private Name name;
	private String id;
	private double gpa;

	private static int idCounter = 0;

	public Student(String firstName, String lastName) {
		final int ID_LENGTH = 10;
		id = String.valueOf(idCounter++);
		for (int i = ID_LENGTH; i > String.valueOf(idCounter).length(); i--) {
			id = '0' + id;
		}
		id = 'S' + id;
		name = new Name(firstName, lastName);
	}

	public Student(String firstName, char middleInitial, String lastName) {
		this(firstName, lastName);
		name.setMiddleInitial(middleInitial);
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
		if(gpa > 4.0 || gpa < 0.0) {
			System.out.println("Hey, GPA is invalid!");
			return;
		}
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
