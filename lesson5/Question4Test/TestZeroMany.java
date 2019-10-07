package Assignments.lesson5.Question4Test;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import Assignments.lesson5.Question4.Customer;
import Assignments.lesson5.Question4.Order;
import Assignments.lesson5.Question4.CustomerOrderFactory;

public class TestZeroMany {
public static void main(String args[]) {
	
	Customer c3=CustomerOrderFactory.createCustomer("Nahu");
	Order order2=CustomerOrderFactory.createOrder(c3, LocalDate.now().plusDays(1));
	Order order1=CustomerOrderFactory.createOrder(c3, LocalDate.now().plusDays(1));
	Order order3=CustomerOrderFactory.createOrder(c3, LocalDate.now().plusDays(1));
	
	order1.setItem("jeans blue");
	order1.setItem("jeans black");
	order2.setItem("thsirt");
	order2.setItem("coat");
	order3.setItem("white nike shoe");
	order3.setItem("jordan shoe");
	
	List<Order> ordersc3=c3.getOrders();
	Iterator<Order> i =ordersc3.iterator();
	System.out.println(ordersc3.size());
	while(i.hasNext()) {
		Order x=i.next();
		System.out.println(x);
	}
}
}
