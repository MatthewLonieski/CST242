package student;

public class BodyBag {
	private Student[] sArray;
	private int nElems;
	
	public BodyBag(int maxSize){
		sArray = new Student[maxSize];
		nElems = 0;
	}
	
	public Student removeByName(String name) {
		int indexFound;
		for(indexFound = 0; indexFound < nElems; indexFound++){
			if(sArray[indexFound].getName().equals(name)) {
				break;
			}
		}
		
		if(indexFound == nElems) {
			return null;
		} else {
			Student temp = sArray[indexFound];
			for(int j = indexFound; j < nElems; j++) {
				sArray[j] = sArray[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
	public Student findByName(String name) {
		for(int i =  0; i < nElems; i++) {
			if(sArray[i].getName().equals(name)){
				return sArray[i];
			}
		}
		return null;
	}
	
	public void insert(Student student) {
		sArray[nElems++] = student;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println();
	}
}
