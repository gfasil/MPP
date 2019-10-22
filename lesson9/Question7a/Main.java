package Assignments.lesson9.Question7a;

import java.util.*;
import java.util.stream.Collectors;

import Assignments.lesson9.Question7b.LambdaLibrary;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here
String lists=list.stream().filter(x->x.getSalary()>100000).filter(x->{return x.getLastName().charAt(0)>'M';}).map(x->x.nameBuilder()).collect(Collectors.joining(", "));
System.out.println(lists);



	}

}
