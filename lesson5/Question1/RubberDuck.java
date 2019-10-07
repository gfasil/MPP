package Assignments.lesson5.Question1;

public class RubberDuck extends Duck {
	
	RubberDuck(){
		
		fly=new  CannotFly();
		quack=new MuteQuack();
	}
	
	
	public void setFlyBehaviour() {
		
		fly=new  CannotFly();
	}
	
	@Override
	public void display() {
		
		System.out.println("displaying RubberDuck duck");
	}

}
