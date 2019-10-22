package Assignments.lesson10.Question2;

import java.util.Arrays;
import java.util.List;

public class prob2 {

	
	public  static <T extends Comparable<? super T>>  T secMin(List<T> t) {
		
		T min=t.get(0);
		T smin=t.get(1);
		for(T i:t) {
			if(i.compareTo(min)<0) {
				smin=min;
				min=i;
			
			}
			 if(!i.equals(min)&&i.compareTo(smin)<0) {
				
				smin=i;
			}
		}
		return smin;
	}
	
public static int secMin1(List<Integer> t) {
		
	Integer min=t.get(0);
	Integer smin=t.get(1);
		for(Integer i:t) {
			
			if(i.compareTo(min)<0) {
				smin=min;
				min=i;
			}
			 if(!i.equals(min)&& i.compareTo(smin)<0) {
				
				smin=i;
			
			}
		}
	//	System.out.println(smin);
		return smin;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=Arrays.asList("ab","cd","ef","gh");
		List<Integer> l1=Arrays.asList(11,2,3,4);
		String te="ab";
		String ff="cd";
	//	secMin(l);
	System.out.println(secMin(l));
	System.out.println(secMin(l1));
	}

}
