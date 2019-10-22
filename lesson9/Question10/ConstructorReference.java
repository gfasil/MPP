package Assignments.lesson9.Question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female candidate names
	 
		Arrays.stream(list).filter(x->x.getGender().equals("Female")).map(Human::getName).forEach(System.out::println);
    // Query 2 : create an object by choosing suitable Interface to the specified constructors(Totally 3 constructors)using fourth type of Method Reference ClassName::new. Then print the object status 
 
		Function<String,Human> human1=Human::new;
	Human fasil=human1.apply("fasil");
	
	System.out.println(fasil);
	BiFunction<String,Integer,Human> human2=Human::new;
	Human ellen=human2.apply("Ellen",45);
	System.out.println(ellen);
	TriFunction<String,Integer,String,Human> human3=Human::new;
	Human megan=human3.apply("Megan",45,"Female");
	System.out.println(megan);
	
	// Query 3 : Count the male candidates whose age is more than 30
    
	Long count=Arrays.stream(list).filter(x->x.getGender().equals("Male")&&x.getAge()>30).count();
	 System.out.println(count);
    
   }



}
