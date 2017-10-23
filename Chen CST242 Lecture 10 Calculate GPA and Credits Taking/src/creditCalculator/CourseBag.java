package creditCalculator;

import java.util.Arrays;

public class CourseBag {
	private Course[] courseArray;
	private int nElems;

	public CourseBag(int maxSize) {
		courseArray = new Course[maxSize];
		nElems = 0;
	}

	public Course[] getCourseArray() {
		return Arrays.copyOf(courseArray, nElems);
	}

	public void insert(Course course) {
		courseArray[nElems++] = course;
	}

}
