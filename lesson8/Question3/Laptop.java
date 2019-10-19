package Assignments.lesson8.Question3;

import java.util.function.Predicate;


public class Laptop {
	
	private String brand;
	private double ramSize;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(ramSize) != Double.doubleToLongBits(other.ramSize))
			return false;
		return true;
	}
	
	public   boolean myMethod(Laptop l1) {

		if(l1.equals(null)) return false;
		
		Predicate<Laptop> temp=this::equals;
		return temp.test(l1);
		
		
	}




	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ramSize=" + ramSize + "]";
	}



	public Laptop(String brand, double ramSize) {
		super();
		this.brand = brand;
		this.ramSize = ramSize;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public double getRamSize() {
		return ramSize;
	}



	public void setRamSize(double ramSize) {
		this.ramSize = ramSize;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l1=new Laptop("asus",8);
		Laptop l2=new Laptop("acer",8);
		Laptop l3=new Laptop("asus",8);
	System.out.println(l1.myMethod(l2));
	System.out.println(l1.myMethod(l3));
	System.out.println(l2.myMethod(l3));

	}

}
