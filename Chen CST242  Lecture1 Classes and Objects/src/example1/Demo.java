package example1;

public class Demo {

	public static void main(String[] args) {
//		Circle c1 = new Circle();// default constructor
//		Circle c2 = new Circle();
//		c1.setRadius(10);
//		c2.setRadius(20);
//		c2 = c1;
//		System.out.println(c2.getRadius());
		
		int i = 1;
		int[] numbers = { 1, 2, 3, 4};
		justATest(i, numbers);
		System.out.println(i + "\t" + numbers[0]);

	}
	
	private static void justATest(int n, int[] nums){
		n = 10;
		nums[0] = 100;
		System.out.println(n + "\t" + nums[0]);
	}

}