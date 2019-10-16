package Assignments.lesson7.Question2;

public final class Circle implements Figure {
	final private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double computeAveragePerimeter() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
}