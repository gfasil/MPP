package Assignments.lesson5.Question1;

public abstract class Duck  {
	
	protected FlyBehaviour fly=null;
	protected QuackBehaviour quack=null;
	public abstract void display();
	public void swimming() {
		
		System.out.println("i am a duck and i can swim");
	}
	public void fly() {
		fly.fly();
	}
	public void quack() {
		quack.quack();
	}
	
	public void template() {
		
		display();
		swimming();
		fly();
		quack();
	}
}
