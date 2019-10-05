package Assignments.lesson4.Question1;

import java.time.LocalDate;
import java.util.List;

public class Commisioned extends Employee{
	private double commission;
	private double baseSalary;
	private List<Order>  ord;
	
	public Commisioned(String empid, double commission, double baseSalary, List<Order> ord) {
		super(empid);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.ord = ord;
	}
	
	@Override
	public double calSalary(int month,int year) {
		// TODO Auto-generated method stub
		int count=0;
		for(Order o:ord)
			
		{
			LocalDate l=o.getOrderDate();
		//	System.out.println(l.getMonthValue()+1+" "+ l.getYear() +" "+ month);
			if(l.getYear()==year  &&l.getMonthValue()+1==month){
				count+=o.getOrderAmount();
				
			}
			
		}
		
		return baseSalary+(count*commission);// 20 percent of orders
	}
}
