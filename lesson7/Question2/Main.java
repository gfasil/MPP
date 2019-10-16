package Assignments.lesson7.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Figure rec = new Rectangle(5, 6);
		Figure tr = new Triangle(5, 6);
		Figure cl = new Circle(5);
		Figure eq = new EquilateralTriangle(10);
		Figure el=new Ellipse(3,4);
		
		List<Figure> figures = new ArrayList<>(Arrays.asList(rec,tr,cl,eq,el));


		double perimeter = 0.0;

		for (Figure f : figures) {
			perimeter += f.computeAveragePerimeter();
		}
		System.out.println("Sum of Areas = " + perimeter);
		System.out.println("Sum of Areas = " + rec.computeAveragePerimeter());

	}

}
