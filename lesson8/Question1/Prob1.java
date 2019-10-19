package Assignments.lesson8.Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Prob1 {
	
	public static void listTest(double x, double y, BiFunction<Double,Double,List<Double>> bf) {
		
		System.out.println(bf.apply(x, y));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Double,Double,List<Double>> res= (x,y)->{ 
			
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x,y));
			list.add(x * y);
			return list;
			
		};
		List<Double> listres=res.apply(2.0, 3.0);
		listres.forEach(System.out::println);
		
		Prob1.listTest(2.0,3.0,new BiFunction<Double,Double,List<Double>>() {

			@Override
			public List<Double> apply(Double x, Double y) {
				// TODO Auto-generated method stub
				List<Double> list = new ArrayList<>();
				list.add(Math.pow(x,y));
				list.add(x * y);
				return list;
			}});
		Prob1.listTest(2.0,3.0, (x,y)->{ 
			
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x,y));
			list.add(x * y);
			return list;});
	}

}
