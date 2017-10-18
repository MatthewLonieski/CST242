package college;

public class Course {
	private String title;
	private String number;
	private Faculty faculty;
	private Textbook textbook;
	private Classroom classroom;
	private Student[] students;

	public Course(String title, String number) {
		super();
		this.title = title;
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = new Faculty(faculty.getName().getFirstName(), 
				faculty.getName().getMiddleInitial(), 
				faculty.getName().getLastName());
//		this.faculty.setId(faculty.getId());
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", number=" + number + ", faculty=" + faculty + ", textbook=" + textbook
				+ ", classroom=" + classroom + "]";
	}

}
