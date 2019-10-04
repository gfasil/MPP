package Assignments.lesson3.Question4;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static double computeTotalRent(List<Propertires> properties) {
		double totalRent = 0;
		for (Propertires o : properties) {
			
			totalRent+=o.calRent();
			
		}
		return totalRent;
	}
	public static List<Propertires> computeCity(List<Propertires> properties, String cities) {
		
		List<Propertires> cityproperties=new ArrayList<>();
		for (Propertires o : properties) {
			
			String city=o.getAddress().getCity();
			if(city.equals(cities)) {
				cityproperties.add(o);
				
			}
		}
		return cityproperties;
	}
		
}
