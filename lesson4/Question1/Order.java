package Assignments.lesson4.Question1;

import java.time.LocalDate;

public class Order {
	private int orderAmount;
	private Commisioned com;
	private String orderNo;
	private LocalDate orderDate;
	public Order(int orderAmount, String orderNo, LocalDate orderDate) {
		super();
		this.orderAmount = orderAmount;
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		
	}
	
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Commisioned getCom() {
		return com;
	}
	public void setCom(Commisioned com) {
		this.com = com;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	

}
