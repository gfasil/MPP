package Assignments.lesson5.Question1;

public class RedHeadDuck extends Duck {
	
	
	RedHeadDuck(){
		
		fly=new  FlyWithWings();
		quack=new Squeak();
	}
	
	
	public void setFlyBehaviour() {
		
		fly=new  FlyWithWings();
	}
	
	@Override
	public void display() {
		
		System.out.println("displaying Red Head Duck duck");
	}
}
