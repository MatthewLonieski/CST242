package college;

public class Demo2 {
	public static void main(String[] args) {
		Textbook t1 = new Textbook("Java", 100.00);
		Textbook t2 = new Textbook("Java", 100.00);
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
	}

}
