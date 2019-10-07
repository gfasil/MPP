package Assignments.lesson5.Question4;

import java.time.LocalDate;
import java.util.*;

public class Order {
	
	List<Item> item;
	LocalDate date;
  Order(LocalDate date,Customer cust) {
	this.date=date;
	item=new ArrayList<>();
	
	cust.setOrder(this);
	
}
  
  

public List<Item> getItem() {
	return item;
}
public void setItem(String name) {
	item.add(new Item(name));
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
@Override
public String toString() {
	return "Order [item=" + item + ", date=" + date + "]";
}

}
