package Assignments.lesson3.Question4;

public class Trailer extends Propertires {
	
	public Trailer(Address address) {
		super(address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calRent() {
		// TODO Auto-generated method stub
	int	rent=500;
	this.setRent(rent);
	return this.getRent();
	
	}

	@Override
	public String toString() {
		return "Trailer [" + super.toString();
	}
	

}
