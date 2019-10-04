package Assignments.lesson3.Question4;

public class House extends Propertires {
	
	

	private double lotSize;
	public House(Address address, double lotSize) {
		super(address);
		this.lotSize=lotSize;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calRent() {
		// TODO Auto-generated method stub
		double rent=0.1*lotSize;
		this.setRent(rent);
		return this.getRent();
		
	}
	@Override
	public String toString() {
		return "House [lotSize=" + lotSize +"," + super.toString();
	}

	

}
