package Assignments.lesson1.Question2;

public class OrderLine {
	private int linenum;
	private double price;
	private int quantity;
	private Order orders;
	public OrderLine(int linenum, double price, int quantity, Order orders) {
		super();
		this.linenum = linenum;
		this.price = price;
		this.quantity = quantity;
		this.orders = orders;
	}
	public OrderLine(Order order) {
		// TODO Auto-generated constructor stub
		this.orders = order;
	}
	@Override
	public String toString() {
		return "OrderLine [linenum=" + linenum + ", price=" + price + ", quantity=" + quantity + 
				 "]";
	}
	public int getLinenum() {
		return linenum;
	}
	public void setLinenum(int linenum) {
		this.linenum = linenum;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Order getOrders() {
		return orders;
	}
	
	

}
