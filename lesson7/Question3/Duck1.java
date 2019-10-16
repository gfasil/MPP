package Assignments.lesson7.Question3;

public abstract class Duck1 implements Flyable,Quackable {
	

		public abstract void display();
		public  void swimming() {
			
			System.out.println("i am a duck and i can swim");
		}
	
	
		
		public  void template() {
			 display();
			 swimming();
			 quack();
			 fly();
		}
	
}
