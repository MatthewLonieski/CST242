package student;

public class GradeActivity {
	private double score;

	public GradeActivity() {
		super();
	}

	public GradeActivity(double score) {
		super();
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public char getLetterGrade() {
		if(score >= 90) {
			return 'A';
		} else if(score >= 80) {
			return 'B';
		} else if(score >= 70) {
			return 'C';
		} else if (score >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
}
