package Assignments.lesson9.Question7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	
	
	public static final TriFunction<List<Employee>,Double,Character,String> emps2=(a,b,c)->
	
	a.stream().filter(x->x.getSalary()>b).filter(x->{return x.getLastName().charAt(0)>c;}).map(x->x.nameBuilder()).collect(Collectors.joining(", "));

}
