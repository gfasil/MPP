package Assignments.lesson1.Question2;
import java.time.*;
public class Order {
LocalDate orderDate;
OrderLine oline;


	public Order(int linenum, double price, int quantity,LocalDate orderDate) {
		this.orderDate=orderDate;
		this.oline=new OrderLine(linenum,price,quantity,this);
		
		}
	public Order(LocalDate orderDate) {
		this.orderDate=orderDate;
		this.oline=new OrderLine(this);
		
		}


	public LocalDate getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}


	public OrderLine getOline() {
		return oline;
	}
	public OrderLine setOline(int linenum, double price, int quantity,LocalDate orderDate) {
		 oline=new OrderLine(linenum,price,quantity,this);
		
		return oline;
	}
	


	@Override
	public String toString() {
		return "Order [orderDate=" + orderDate + ", oline=" + oline.toString() + "]";
	}
	

}
