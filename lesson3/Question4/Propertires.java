package Assignments.lesson3.Question4;

public  abstract class Propertires {
	private Address address;
	private double rent;
	
	 public abstract double calRent();
	@Override
	public String toString() {
		return address + ", rent=" + rent + "]";
	}
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void setRent(double rent) {
		this.rent = rent;
	}


	//public abstract double getRent();
	
	
	public Propertires(Address address) {
		super();
		this.address = address;
		
	}


	public double getRent() {
		return rent;
	}
}
