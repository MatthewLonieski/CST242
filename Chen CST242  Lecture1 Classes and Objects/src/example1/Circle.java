package example1;

public class Circle {
	private double radius;
	
	
	//overloaded constructors
	public Circle() { // no-arg constructor
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//methods
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getCircumference() {
		return Math.PI * radius * 2;
	}
	
	// setter or mutator method
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// getter or accessor method
	public double getRadius() {
		return radius;
	}
	
	public String toString() {
		return "Radius = " + radius;
	}

}
