package college;

public class Grades {
	private double midTermScore;
	private double finalScore;

	public Grades(double midTermScore, double finalScore) {
		super();
		this.midTermScore = midTermScore;
		this.finalScore = finalScore;
	}
	
	public Grades(Grades grades) {
		this(grades.midTermScore, grades.finalScore);
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
		return "Grades [midTermScore=" + midTermScore + ", finalScore=" + finalScore + "]";
	}

}
