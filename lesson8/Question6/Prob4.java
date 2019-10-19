package Assignments.lesson8.Question6;

import java.util.Arrays;
import java.util.Comparator;

public class Prob4 {

	
	public static void main(String args[]) {
		
		
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		
		Comparator<String> cm1=(s1,s2)->s1.compareToIgnoreCase(s2);
		
		Arrays.sort(names, String::compareToIgnoreCase); // using method reference
		Arrays.sort(names, (s0,s1)->s0.compareToIgnoreCase(s1)); // using lambda expression
		Arrays.sort(names, cm1); // using predefined comparator
		
		for(String s:names){
			
			System.out.println(s);
		}
		
		
	}
}
