package Assignments.lesson3.Question4;


import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		Owner fasil=new Owner();
		
		
		Address  a1=new Address("20011","DC","Washington", "14th st");
		Address  a2=new Address("20011","MD","Washington", "14th st");
		Propertires house=new House(a1, 40);
		Propertires condo=new Condo(a1,10);
		Propertires trailer=new Trailer(a2);
		fasil.getProperties().addAll(Arrays.asList(house,condo, trailer));
		List<Propertires> properties=fasil.getProperties();
		
		double totalrent=Admin.computeTotalRent(properties);
	System.out.println(totalrent);
	
	List<Propertires> cityproperties=Admin.computeCity(properties, "DC");
	
	for(Propertires l:cityproperties) {
		
		System.out.println(l);
	}
	}
}
