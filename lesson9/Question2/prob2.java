package Assignments.lesson9.Question2;

import java.util.IntSummaryStatistics;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> x= Stream.of(1,2,3,4,4,4,5,77);
		
		IntSummaryStatistics summary=x.collect(Collectors.summarizingInt(z->(int)z));
		System.out.println("maximum value = " +summary.getMax() +" "+"minumum value = " +summary.getMin());
		
	
	}

}
