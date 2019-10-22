package Assignments.lesson9.Question4;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.*;

public class prob4 {
	
	private static final IntUnaryOperator integers= x->x*1;
	private static final IntUnaryOperator integers1=integers ;
	
	
	public static void printSquares(int num) {
		
		
		
		IntStream ints= IntStream.iterate(1, x->x+1).map(x->x*x).limit(num);
	
		ints.forEach(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(4);
	
			
	}

}
