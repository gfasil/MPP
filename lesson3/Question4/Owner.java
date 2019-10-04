package Assignments.lesson3.Question4;

import java.util.*;

public class Owner {

	private List<Propertires> properties;
	
	public Owner() {
		
		properties=new ArrayList<>();
	}
	public  List<Propertires> getProperties(){
		return properties;
		
	}
	
	public Propertires addHouse(Address address, double lotSize) {
		
		Propertires temp=new House(address,lotSize);
		properties.add(temp);
		return temp;
	}
public Propertires addCondo(Address address, int numFloors) {
		
	Propertires temp=new Condo(address,numFloors);
		properties.add(temp);
		return temp;
	}
public Propertires addTrailer(Address address) {
	
	Propertires temp=new Trailer(address);
	properties.add(temp);
	return temp;
}
@Override
public String toString() {
	return "Owner [properties=" + properties + "]";
}
	
}
