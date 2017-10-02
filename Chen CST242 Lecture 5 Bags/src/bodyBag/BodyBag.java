package bodyBag;

public class BodyBag {
	private Student[] bag;
	private int nElems;

	public BodyBag(int maxSize) {
		bag = new Student[maxSize];
		nElems = 0;
	}

	public Student findHighestMidTermScore() {
		double highest = bag[0].getMidTermScore();
		int highestIndex = 0;
		
		for(int i = 1; i < nElems; i++) {
			if(highest < bag[i].getMidTermScore()) {
				highest = bag[i].getMidTermScore();
				highestIndex = i;
			}
		}
		
		return bag[highestIndex];
	}

	public Student findHighestFinalScore() {
		double highest = bag[0].getFinalScore();
		int highestIndex = 0;
		
		for(int i = 1; i < nElems; i++) {
			if(highest < bag[i].getFinalScore()) {
				highest = bag[i].getFinalScore();
				highestIndex = i;
			}
		}
		
		return bag[highestIndex];
	}

	public void insert(Student student) {
		bag[nElems++] = student;
	}

	public Student removeByName(String name) {
		int indexFound;
		for (indexFound = 0; indexFound < nElems; indexFound++) {
			if (bag[indexFound].getName().equals(name)) {
				break;
			}
		}
		if (indexFound == nElems) {
			return null;
		} else {
			Student backup = bag[indexFound];
			for (int j = indexFound; j < nElems; j++) {
				bag[j] = bag[j + 1];
			}
			nElems--;
			return backup;
		}
	}

	public Student findByName(String name) {
		for (int i = 0; i < nElems; i++) {
			if (bag[i].getName().equals(name)) {
				return bag[i];
			}
		}
		return null;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(bag[i]);
		}
	}
}
