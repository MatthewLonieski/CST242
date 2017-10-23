package p1Intro;

public class Calculator implements IntCalculator {

	@Override
	public int calculate(int number) {
		return number * number;
	}

	@Override
	public int computer(int number1, int number2) {
		return number1 * number2;
	}

}
