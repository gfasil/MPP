package Assignments.lesson7.Question4;

import java.util.function.Consumer;

class MyConsumer implements Consumer<String>{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t.toUpperCase());
	}
	
	
}
