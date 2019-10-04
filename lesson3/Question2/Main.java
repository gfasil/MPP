package Assignments.lesson3.Question2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apartment a1=new Apartment(1500.0);
		Apartment a2=new Apartment(1700.0);
		Apartment a3=new Apartment(1200.0);
		Apartment a4=new Apartment(1000.0);
		Apartment a5=new Apartment(1250.0);
		Apartment a6=new Apartment(1300.0);
		Building b1=new Building(2000.0);
		Building b2=new Building(200.0);
		b1.getApts().addAll(Arrays.asList(a1,a2,a3));
		b2.getApts().addAll(Arrays.asList(a4,a5,a6));
		LandLoard fasil=new LandLoard();
		fasil.getBuilding().addAll(Arrays.asList(b1,b2));
		List<Building> blgs=fasil.getBuilding();
		double total=0.0;
		for(Building b: blgs)
		{
			
		double profit=b.calProfit();
		total+=profit;
		}
		System.out.println("Total profit for fasil is "+ total);
	}
	
}
