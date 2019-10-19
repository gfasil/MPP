package Assignments.lesson8.Question4;

import java.util.function.Supplier;

public class MethodRefernceTest {
	
	
	class MySupplier implements Supplier<Double>{

		@Override
		public Double get() {
			// TODO Auto-generated method stub
			return Math.random();
		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Double> rand= Math::random;
		
		Supplier<Double> rand1=()->Math.random();
		
		System.out.println("using method refernce :"+rand.get());
		System.out.println("using Lambda :"+rand1.get() );
		
		MySupplier s1=new MethodRefernceTest().new MySupplier();
		System.out.println("using inner class :"+s1.get() );

	}

}
