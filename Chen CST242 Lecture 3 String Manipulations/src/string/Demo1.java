package string;

public class Demo1 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello"; // interned object
		System.out.println(str1 == str2); // compare contents of ref. variables
		System.out.println(str1.equals(str2));// compare contents of String objects
	
		// create a new String object
		String str3 = new String("Hello"); // guaranteed new object
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		// String objects are immutable
		str1 = "Hi";
		System.out.println(str1 == str2);
		str1 = "hi";
		
		String str4 = "Hello";
		System.out.println(str2 == str4);
		System.out.println(str3 == str4);
	}
	

}
