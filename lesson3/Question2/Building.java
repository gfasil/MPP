package Assignments.lesson3.Question2;

import java.util.*;

public class Building {
private List<Apartment> apts;
private double maintenanceCost;


public double calProfit() {
	double renttotal=0.0;
	for(Apartment temp: apts) {
		
		double rent=temp.getRent();
		renttotal+=rent;
	}
	
	return renttotal-maintenanceCost;
	
}


public Building( double maintenanceCost) {
	
	apts=new ArrayList<>();
	this.maintenanceCost = maintenanceCost;
}


public double getMaintenanceCost() {
	return maintenanceCost;
}


public void setMaintenanceCost(double maintenanceCost) {
	this.maintenanceCost = maintenanceCost;
}


public List<Apartment> getApts() {
	return apts;
}

}
