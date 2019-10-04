package Assignments.lesson3.Question1;

public class PersonWithJob {
	
	private double salary;
	private Person p;
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		p=new Person(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob pjob = (PersonWithJob)aPerson;
		boolean isEqual = this.p.equals(pjob.p) &&
				this.getSalary()==pjob.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		PersonWithJob p2 = new PersonWithJob("Joe", 30000);
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		System.out.println("p2.equals(p1)? " + p2.equals(new PersonWithJob("fasil", 30000)));
		System.out.println("p2.equals(p1)? " + p2.equals(new PersonWithJob("Joe", 20000)));
	}


}
