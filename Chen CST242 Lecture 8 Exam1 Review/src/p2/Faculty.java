package p2;

public class Faculty extends Person {
	private double salary;

	public Faculty(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	
	public Faculty (Faculty faculty) {
		super(faculty.getName());
		setId(faculty.getId());
		this.salary = faculty.salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", Salary=" + salary;
	}

}
