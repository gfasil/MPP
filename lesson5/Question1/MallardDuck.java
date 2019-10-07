package Assignments.lesson5.Question1;

public class MallardDuck extends Duck {
	
	
	MallardDuck(){
		
		fly=new  FlyWithWings();
		quack=new MuteQuack();
	}
	
	
	public void setFlyBehaviour() {
		
		fly=new  FlyWithWings();
	}
	
	@Override
	public void display() {
		
		System.out.println("displaying mallar duck");
	}
}
