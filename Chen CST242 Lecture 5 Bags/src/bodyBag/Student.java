package bodyBag;

public class Student {
	private String name;
	private double midTermScore;
	private double finalScore;

	public Student(String name, double midTermScore, double finalScore) {
		super();
		this.name = name;
		this.midTermScore = midTermScore;
		this.finalScore = finalScore;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMidTermScore() {
		return midTermScore;
	}

	public void setMidTermScore(double midTermScore) {
		this.midTermScore = midTermScore;
	}

	public double getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", midTermScore=" + midTermScore + ", finalScore=" + finalScore + "]";
	}

}
