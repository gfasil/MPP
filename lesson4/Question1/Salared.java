package Assignments.lesson4.Question1;

public class Salared extends Employee{
	private double salary;

	@Override
	public double calSalary(int month,int year) {
		// TODO Auto-generated method stub
		return salary;
	}

	public Salared(String empid, double salary) {
		super(empid);
		this.salary = salary;
	}

}
