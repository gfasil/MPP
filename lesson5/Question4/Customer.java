package Assignments.lesson5.Question4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	String name;
	List<Order> orders=new ArrayList<>();
	 Customer(String name) {
		
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrder(Order o) {
		orders.add(o);
		
		
	}
}
