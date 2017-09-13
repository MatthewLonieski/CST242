package example1;

public class Circle {
	double radius;
	
	//methods
	double getArea() {
		return Math.PI * radius * radius;
	}
	double getCircumference() {
		return Math.PI * radius * 2;
	}
	
	void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	double getRadius() {
		return radius;
	}

}
