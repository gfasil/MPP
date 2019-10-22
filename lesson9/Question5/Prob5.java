package Assignments.lesson9.Question5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Prob5 {
	
public static	Stream<String> streamSection(Stream<String> stream, int m, int n){
		
		
		
		return stream.skip(m).limit(n-m+1);
		
		
	}

	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
		"iii").stream();
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		streamSection(nextStream(),0,3).forEach(System.out::println);
		System.out.println("................");
		streamSection(nextStream(),1,3).forEach(System.out::println);
		System.out.println("................");
		streamSection(nextStream(),2,5).forEach(System.out::println);
	}

}
