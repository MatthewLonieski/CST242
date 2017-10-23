package p3DefaultInterfaces;

public class Demo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.add(5, 5));
		System.out.println(c1.subtract(5, 2));
		System.out.println(c1.multiply(5, 3));
		System.out.println(c1.divide(10, 2));
		
		IntCalculator c2 = new IntCalculator() {
		};
		System.out.println(c2.add(5, 5));
		System.out.println(c2.subtract(5, 2));
		System.out.println(c2.multiply(5, 3));
		System.out.println(c2.divide(10, 2));
	}

}
