package Assignments.lesson7.Question4;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		System.out.println("using inner class");
		list.forEach(new Consumer<String>() {

			
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t.toUpperCase());
			}});
		
		System.out.println("/n using lambda");
		list.forEach((e)->{System.out.println(e.toUpperCase());});
		
		System.out.println("using external class");
		list.forEach(new MyConsumer());
		
		
	}
	
	
	//implement a Consumer
	
	
}