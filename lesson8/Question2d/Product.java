package Assignments.lesson8.Question2d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

 class Product {
final String title;
final double price;
final int model;
public String getTitle() {
return title;
}
public double getPrice() {
return price;
}
public int getModel() {
return model;
}
public Product(String title, Double price, int model) {
this.title = title;
this.price = price;
this.model = model;
}
@Override
public String toString() {
return String.format("\n %s : %s : %s", title, price, model);
}
public static void main(String[] args) {
	
	List<Product> list=new ArrayList<>(Arrays.asList(new Product("iphone 8",600.0,2018),new Product("mac book pro",1000.0,2017)
			,new Product("acer laptop",800.0,2019),new Product("acer laptop",800.0,2018),new Product("playstation 4",250.0,2018)));
	
	Collections.sort(list, (o1,o2)->{ 
		
		if(o1.getTitle().equals(o2.getTitle()) )
			return Integer.compare(o1.getModel(),o2.getModel());
		else { return o1.getTitle().compareTo(o2.getTitle());}
	
	});
	list.forEach(System.out::println);
}


}
