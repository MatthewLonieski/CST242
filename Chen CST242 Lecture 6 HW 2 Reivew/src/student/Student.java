package student;

public class Student {
	private String name;
	private Grades grades;

	public Student(String name, Grades grades) {
		super();
		this.name = name;
		this.grades = grades;
	}

	public Student(String name, int numberOfQuestions, int numberOfQuestionsMissed, double grammarScore,
			double spellingScore, double lengthScore, double contentScore) {
		this.name = name;
		grades = new Grades(numberOfQuestions, numberOfQuestionsMissed, grammarScore, spellingScore, lengthScore,
				contentScore);
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

	public void setGrades(Grades grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student: " + name + "\n" + grades;
	}

}
