package Assignments.lesson7.Question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck1 mallard=new MallardDuck();
		Duck1 redhead=new RedHeadDuck();
		Duck1 d=new DecoyDuck();
		Duck1 d1=new RubberDuck();
		
		Duck1[] ducks= {mallard,redhead,d,d1};
		
		for(Duck1 temp:ducks) {
			System.out.println(temp.getClass().getSimpleName()+":");
			temp.template();
			
		}
		
		
		
	
	}

}
