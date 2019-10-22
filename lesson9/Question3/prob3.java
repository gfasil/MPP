package Assignments.lesson9.Question3;

import java.util.Arrays;
import java.util.List;

public class prob3 {

	
	public static int countWords(List<String> words, char c, char d, int len) 
	{
		//return 0;
		
	return (int)	words.stream().filter(x->x.length()==len && x.contains(Character.toString(c)) && (!x.contains(Character.toString(d)))).count();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="fasil";
		List<String> temp=Arrays.asList("fasil","faya","girma");
		
		System.out.println(x.contains("f") && !x.contains("e"));
		
		System.out.println(countWords(temp,'a','e',5));

	}

}
