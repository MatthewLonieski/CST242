package college;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Adam", 100, 90); //first grades object
		Grades g1 = s1.getGrades();   // shallow copy, passing the address only
		Grades g2 = s1.getGradesDeep(); // deep copy, meaning a new Grades object created
		g1.setFinalScore(50); // set first Grades object final score to 50
		g2.setFinalScore(0);
		
		System.out.println("FIrst Grades final score: " + g1.getFinalScore());
		System.out.println("Second Grades final score: " + g2.getFinalScore());
		
	}

}
