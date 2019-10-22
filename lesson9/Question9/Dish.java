package Assignments.lesson9.Question9;
import java.util.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }
    
    public static boolean  checkVeggi(List<Dish> list) {
    	
    	boolean res=false;
    	
    	Optional<Dish> temp=list.stream().filter(x->x.isVegetarian()==true).findAny();
    	
    	if(temp.isPresent()) {res=true;}
    	
    	return res;
    	
    	
    	
    }
    public static boolean isHealthyMenu(List<Dish> list){
        return list.stream().allMatch(d -> d.getCalories() < 1000);
    }
    public static boolean isUnHealthyMenu(List<Dish> list){
        return list.stream().noneMatch(d -> d.getCalories() >=1000);
    }
    
 public static Optional<Dish>  getMeatMenu(List<Dish> list) {
    	
    	
    	
    	Optional<Dish> temp=list.stream().filter(x->x.getType().equals(Dish.Type.MEAT)).findFirst();
    	
    	
    	
    	return temp;
    	
    	
    	
    }
 public static int  calcCalories(List<Dish> list) {
 	
 	
 	
 	return (int)list.stream().map(x->x.getCalories()).reduce(1,(x,y)->x+y);
 	
 	 }
 public static int  calculateTotalCaloriesMethodReference(List<Dish> list) {
	 	
	 	
	 	
	 	return (int)list.stream().map(Dish::getCalories).reduce(1,Integer::sum);
	 	
	 	 }
    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    
   
}