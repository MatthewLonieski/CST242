package college;

public class PersonBag {
	private Person[] personArray;
	private int nElems;
	
	public PersonBag(int maxSize) {
		personArray = new Person[maxSize];
		nElems = 0;
	}
	
	public Person findPersonById(String id){
		for(int i = 0; i < nElems; i++) {
			if(id.equals(personArray[i].getId())) {
				return personArray[i];
			}
		}
		return null;
	}
	
	public Student findStudentWithHighestGPA() {
		double highestGPA = 0.0;
		int highestGPAIndex = -1;
		// cycle through the bag
		for(int i = 0; i < nElems; i++) {
			if(personArray[i] instanceof Student) {
				if(highestGPA < ((Student)personArray[i]).getGpa()){
					highestGPA = ((Student)personArray[i]).getGpa();
					highestGPAIndex = i;
				}
			}
		}
		if(highestGPAIndex == -1) {
			System.out.println("NO one has a GPA over 0.0");
			return null;
		}
		return (Student)personArray[highestGPAIndex];
	}
	
	public void insert(Person person) {
		personArray[nElems++] = person;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(personArray[i]);
		}
		System.out.println();
	}
}
