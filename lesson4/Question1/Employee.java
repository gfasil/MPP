package Assignments.lesson4.Question1;

public abstract class Employee {
	
	private String empid;
	
	
	public void print(int month,int year) {
		
		
		PayCheck p=calCompensation(month,year);
		System.out.println(this);
		
		System.out.println(p);
	}
	@Override
	public String toString() {
		return "Employee ID: " + empid ;
	}
	public abstract double calSalary(int month,int year);
	
	PayCheck paycheck=null;
	public PayCheck calCompensation(int month,int year) {
		
	 paycheck=new PayCheck(calSalary(month,year));
	 
	 paycheck.getNetPay();
		return paycheck;
	}
	public Employee(String empid) {
		
		this.empid = empid;
	}

}
