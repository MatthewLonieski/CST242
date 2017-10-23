package p4FunctionalInterfaces;

public class Demo {

	public static void main(String[] args) {
		IntCalculator add = (a, b) -> a + b;
		IntCalculator subtract = (a, b) -> a - b;
		IntCalculator multiply = (a, b) -> a * b;
		IntCalculator divide = (a, b) -> a / b;
		IntCalculator lots = (a, b) -> {
			int i = a + b;
			int j = i * i;
			return j;
		};
		
		System.out.println(add.compute(5, 5));
		System.out.println(subtract.compute(5, 5));
		System.out.println(multiply.compute(5, 5));
		System.out.println(divide.compute(5, 5));
	}

}
