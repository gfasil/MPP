package Assignments.lesson5.Question2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Figure rec = new Rectangle(5, 6);
		Figure tr = new Triangle(5, 6);
		Figure cl = new Circle(5);

		List<Figure> figures = new ArrayList<>();
		figures.add(rec);
		figures.add(tr);
		figures.add(cl);

		double SumofAreas = 0.0;

		for (Figure f : figures) {
			SumofAreas += f.computeArea();
		}
		System.out.println("Sum of Areas = " + SumofAreas);

	}

}
