package sampleCode1;

/*
 * A subclass gets everything that is not private from the superclass
 * Keyword final prevents any subclasses
 * Overridden methods-- methods with the same signature in super- and sub-classes
 * Inheritance is an one-way-street -- from parent to child only
 */ 
import college.Name;

public class Person {
	protected Name name;
	private String id;

	private static int idCounter = 0;

	public Person(String firstName, String lastName) {
		super();
		id = String.valueOf(idCounter++);
		this.name = new Name(firstName, lastName);
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
	
	public void commute() {
		System.out.println("Drive to school...");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
