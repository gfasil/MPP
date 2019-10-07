package Assignments.lesson5.Question2;

public final class Rectangle implements Figure {
	final private double width;
	final private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double computeArea() {
		double area = width * length;
		return area;
	}
}