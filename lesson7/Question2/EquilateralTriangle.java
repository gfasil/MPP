package Assignments.lesson7.Question2;

public class EquilateralTriangle implements Polygon {

	final private double side;
	

	public EquilateralTriangle(double side) {
		this.side = side;
		
	}

	public double getSide() {
		return side;
	}

	
	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		return new double[]{this.side*3};
	}

}
