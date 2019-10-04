package Assignments.lesson3.Question2;

public class Apartment {
 private double rent;

public double getRent() {
	return rent;
}

public void setRent(double rent) {
	this.rent = rent;
}

public Apartment(double rent) {
	super();
	this.rent = rent;
}

@Override
public String toString() {
	return "Apartment [rent=" + rent + "]";
}
}
