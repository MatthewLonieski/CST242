package student;

public class Grades extends GradeActivity {
	private MidTermExam midTermExam;
	private FinalExam finalExam;

	private final double MIDTERM_EXAM_WEIGHT = 0.4;
	private final double FINAL_EXAM_WEIGHT = 0.6;

	public Grades(MidTermExam midTermExam, FinalExam finalExam) {
		super();
		this.midTermExam = midTermExam;
		this.finalExam = finalExam;
		double score = midTermExam.getScore() * MIDTERM_EXAM_WEIGHT + finalExam.getScore() * FINAL_EXAM_WEIGHT;
		setScore(score);
	}

	public Grades(int numberOfQuestions, int numberOfQuestionsMissed, double grammarScore, double spellingScore,
			double lengthScore, double contentScore) {
		super();
		this.midTermExam = new MidTermExam(numberOfQuestions, numberOfQuestionsMissed);
		this.finalExam = new FinalExam(grammarScore, spellingScore, lengthScore, contentScore);
		double score = midTermExam.getScore() * MIDTERM_EXAM_WEIGHT + finalExam.getScore() * FINAL_EXAM_WEIGHT;
		setScore(score);
	}

	public MidTermExam getMidTermExam() {
		return midTermExam;
	}

	public void setMidTermExam(MidTermExam midTermExam) {
		this.midTermExam = midTermExam;
	}

	public FinalExam getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(FinalExam finalExam) {
		this.finalExam = finalExam;
	}

	@Override
	public String toString() {
		return "\t" + midTermExam + "\n\t" + finalExam + "\n\t" + getScore() + "\n\t" + getLetterGrade();
	}

}
