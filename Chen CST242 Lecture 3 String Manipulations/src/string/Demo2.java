package string;

public class Demo2 {

	public static void main(String[] args) {
		String str1 = "Hello";
		int length = str1.length();
		
		char c1 = str1.charAt(1);
		
		String str2 = str1.substring(2);
		
		int index = str1.indexOf("l");
		String name = "john, adam, doe,   4.0, 1234567; 631-123-4567";
//		char middleInitial = name.charAt(name.lastIndexOf(":")-1);
// 		System.out.println(middleInitial);
//		System.out.println(name.lastIndexOf(":"));
		
		char[] chars = name.toCharArray();
//		for (int i = 0; i < chars.length; i++) {
//			System.out.println("\t" + chars[i]);
//		}
		
//		for(char c : chars) {
//			System.out.println(c);
//		}
		
		String[] tokens = name.split("[,; ]");
		
		tokens[1] = String.valueOf(tokens[1].charAt(0));
		
		for(String s : tokens) {
			System.out.println(s);
		}
		double gpa = Double.parseDouble(tokens[3]);
		int id = Integer.parseInt(tokens[4]);
	}

}
