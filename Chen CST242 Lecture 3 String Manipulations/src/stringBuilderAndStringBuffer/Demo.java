package stringBuilderAndStringBuffer;

public class Demo {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" Hi");
		System.out.println(builder);
		builder.insert(3, " Hi ");
		System.out.println(builder);
		System.out.println(builder.reverse());
	}

}
