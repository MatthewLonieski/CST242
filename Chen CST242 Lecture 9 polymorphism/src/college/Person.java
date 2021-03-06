package college;

public abstract class Person {
	private Name name;
	private String id;
	private static int idCounter = 0;

	public Person(String firstName, String lastName) {
		final int ID_LENGTH = 8;
		id = String.valueOf(idCounter++);
		for (int i = ID_LENGTH; i > String.valueOf(idCounter).length(); i--) {
			id = '0' + id;
		}
		name = new Name(firstName, lastName);
	}

	public Person(String firstName, char middleInitial, String lastName) {
		this(firstName, lastName);
		name.setMiddleInitial(middleInitial);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", ID=" + id;
	}
}
