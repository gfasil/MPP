package Assignments.lesson9.Question6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union {
	public Set<String> union(List<Set<String>> sets){
		Set<String> h=new HashSet<String>();
		
		// return h;
		 
		return  sets.stream().reduce(h,(x,y)-> { x.addAll(y); return x;});
	
	}
	public static void main(String[] args) {
		Union u = new Union();
		Set<String> set1  = new HashSet<>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		Set<String> set2  = new HashSet<>();
		set2.add("E");
		set2.add("F");
		set2.add("G");
		Set<String> set3  = new HashSet<>();
		set3.add("1");
		set3.add("2");
		set3.add("3");
		Set<String> set4  = new HashSet<>();
		set4.add("66");
		set4.add("77");
		set4.add("88");
		List<Set<String>> list = new ArrayList<>();
		list.add(set1);
		list.add(set2);
		list.add(set3);
		list.add(set4);
		System.out.println(u.union(list));

	}
}
