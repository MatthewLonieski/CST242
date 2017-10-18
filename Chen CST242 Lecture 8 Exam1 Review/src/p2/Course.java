package p2;

public class Course {
	private String title;
	private Student student;
	private Faculty faculty;

	public Course(String title, Student student, Faculty faculty) {
		super();
		this.title = title;
		this.student = student;
		this.faculty = faculty;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Student getStudent() {
		return new Student(student);
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Faculty getFaculty() {
		return new Faculty(faculty);
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Title= " + title + "\n\tStudent=" + student + "" + "\n\tFaculty=" + faculty + "\n";
	}

}
