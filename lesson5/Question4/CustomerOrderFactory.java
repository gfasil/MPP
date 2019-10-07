package Assignments.lesson5.Question4;

import java.time.LocalDate;

public class CustomerOrderFactory {
	
	
	private CustomerOrderFactory() {
		
	}
	public static Order createOrder(Customer cust,LocalDate date) {
		
		if(cust==null) {
			System.out.println("null");
			throw new NullPointerException();}
		
		return new Order(date,cust);
		
	}
	public static Customer createCustomer(String name) {
		
		return new Customer(name);
	}

}
