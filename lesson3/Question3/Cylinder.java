package Assignments.lesson3.Question3;

public class Cylinder {
	private double height;

	private Circle c;

	Cylinder(double radius, double height) {
		
		this.height = height;

		c = new Circle(radius);
	}

	public double getHeight() {
		return height;
	}

	public double getRadius() {
		return c.getRadius();
	}

	public double computeArea() {
		return c.computerArea() * height;
	}

}
