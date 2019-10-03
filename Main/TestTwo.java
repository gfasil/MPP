package Assignments.lesson1.Test;

import java.time.LocalDate;

import Assignments.lesson1.Question2.Order;
import Assignments.lesson1.Question2.OrderLine;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Order order1=new Order(LocalDate.now());
			
			order1.setOline(12, 23.3, 24, LocalDate.now().minusDays(4));
	//		order1.getOline().setLinenum(12);
		System.out.println(order1.getOline());
	}

}
