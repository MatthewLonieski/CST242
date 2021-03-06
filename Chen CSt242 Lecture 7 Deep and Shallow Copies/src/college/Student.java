package college;

public class Student {
	
	private String name;
	private Grades grades;

	public Student(String name, double midTermScore, double finalScore) {
		super();
		this.name = name;
		this.grades = new Grades(midTermScore, finalScore);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grades getGrades() {
		return grades;
	}
	
	public Grades getGradesDeep() {
		return new Grades(grades);
	}

	public void setGrades(Grades grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grades=" + grades + "]";
	}

}
