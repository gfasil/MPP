package Assignments.lesson7.Question2;

public interface Polygon extends Figure {
	
	public double[] getSides();
	
	default double computeAveragePerimeter() {
		double total=0.0;
		
		double[] side=getSides();
		
		for(double x:side) {
		
		 total+=x;
		
		}
		return total;
	}

}
