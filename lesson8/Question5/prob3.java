package Assignments.lesson8.Question5;

import java.util.Arrays;
import java.util.List;

public class prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		
		fruits.forEach((x)-> System.out.println(x));
		fruits.forEach(System.out::println);
		
	}

}
