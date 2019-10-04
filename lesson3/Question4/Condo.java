package Assignments.lesson3.Question4;

public class Condo extends Propertires{
	
	private int numFloors;
	
	public double calRent() {
		
		double rent=numFloors*400;
		this.setRent(rent);
		return this.getRent();
		
	}
	
	@Override
	public String toString() {
		return "Condo [numFloors=" + numFloors+"," + super.toString();
	}

	public Condo(Address address, int numFloors) {
		super(address);
		this.numFloors=  numFloors;
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
