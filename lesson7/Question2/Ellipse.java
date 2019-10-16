package Assignments.lesson7.Question2;

public class Ellipse implements Figure {
	final private double a;
	final private double E;

	public Ellipse(double a, double e) {
		this.a = a;
		this.E = e;
	}

	public double getA() {
		return a;
	}

	public double getE() {
		return E;
	}



	@Override
	public double computeAveragePerimeter() {
		// TODO Auto-generated method stub
		return 4* getA()* getE();
	}

}
