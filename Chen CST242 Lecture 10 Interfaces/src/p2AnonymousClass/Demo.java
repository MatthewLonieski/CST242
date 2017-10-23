package p2AnonymousClass;

public class Demo {

	public static void main(String[] args) {
		IntCalculator c1 = new IntCalculator() {

			@Override
			public int calculate(int number) {
				return number * number;
			}

			@Override
			public int compute(int number1, int number2) {
				return number1 + number2;
			}
			
		};
		
		System.out.println(c1.calculate(5));
		System.out.println(c1.compute(5, 5));
		
	}

}
