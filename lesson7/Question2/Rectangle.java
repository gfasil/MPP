package Assignments.lesson7.Question2;

public final class Rectangle implements Polygon {
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

	

	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		return new double[]{this.length*2,this.width*2};
	}
}