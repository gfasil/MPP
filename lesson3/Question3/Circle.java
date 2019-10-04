package Assignments.lesson3.Question3;

public class Circle {
private double radius;
Circle(double radius){
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

 

public double computerArea() {
	return Math.PI * (radius * radius);
}
}
