package college;

public class Faculty {
	private Name name;
	private String id;
	private double salary;

	private static int idCounter = 0;

	public Faculty(String firstName, String lastName) {
		final int ID_LENGTH = 10; // final constant
		id = String.valueOf(idCounter++);
		for (int i = ID_LENGTH; i > String.valueOf(idCounter).length(); i--) {
			id = '0' + id;
		}
		id = 'F' + id;
		this.name = new Name(firstName, lastName);
	}

	public Faculty(String firstName, char middleInitial, String lastName) {
		this(firstName, lastName);
		name.setMiddleInitial(middleInitial);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", id=" + id + "]";
	}

}
