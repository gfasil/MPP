package Assignments.lesson5.Question1;

public class DecoyDuck extends Duck {
	
	
	DecoyDuck(){
		
		fly=new  FlyWithWings();
		quack=new MuteQuack();
	}
	
	
	public void setFlyBehaviour() {
		
		fly=new  FlyWithWings();
	}
	
	@Override
	public void display() {
		
		System.out.println("displaying Red Head Duck duck");
	}

}
