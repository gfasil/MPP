package Assignments.lesson4.Question1;

public class Hourly extends Employee {

	private double hourlyWage;
	private int hoursPerWekk;
	
	@Override
	public double calSalary(int month,int year) {
		// TODO Auto-generated method stub
		return hourlyWage*hoursPerWekk*4;
	}

	public Hourly(String empid, double hourlyWage, int hoursPerWekk) {
		super(empid);
		this.hourlyWage = hourlyWage;
		this.hoursPerWekk = hoursPerWekk;
	}
	
	
}
