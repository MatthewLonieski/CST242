package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String[] names = new String[10];
		names[0] = "Adam";
		// names[1] = "Bill";
		names[9] = "Charlie";
		names[5] = "Zack";

		// unchecked runtime exception -- NullPointerException
		for (int i = 0; i < names.length; i++) {
			try {
				System.out.println(names[i].length());
			} catch (NullPointerException e) {
//				e.printStackTrace();
			}
		}
		System.out.println("For loop is Finished");
		// unchecked runtime exception
		// System.out.println(names[-1]);
		// unchecked runtime exception
		// Scanner kb = new Scanner(System.in);
		// System.out.println("Enter a number: ");
		// double number = kb.nextDouble();
		// System.out.println("The number is: " + number);
	}

}
