package Assignments.lesson7.Question2;

public final class Triangle implements Figure {
	final private double base;
	final private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double computeAveragePerimeter() {
		double area = 1.0/2.0 * base * height;
		return area;
	}
}
