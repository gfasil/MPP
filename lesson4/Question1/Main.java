package Assignments.lesson4.Question1;

import java.time.LocalDate;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> list=new ArrayList<>();
		list.add(new Order(200,"100",LocalDate.of(2019, 9, 1)));
		list.add(new Order(100,"100",LocalDate.of(2019, 9, 10)));
			Commisioned c=new Commisioned("123",0.8,500,list);
			List<Employee> em=new ArrayList<>();
			em.add(new Salared("121",4000));
			em.add(new Hourly("122",15.67,20));
			em.add(c);
			
			for(Employee e:em)
			{
				e.print(10,2019);
			}
	}

}
