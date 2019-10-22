package Assignments.lesson9.Question4;

import java.util.Objects;
import java.util.function.IntUnaryOperator;

public class myOp implements IntUnaryOperator {

	@Override
	public int applyAsInt(int operand) {
		// TODO Auto-generated method stub
		return operand*operand;
	}
	  @Override
	   public IntUnaryOperator compose(IntUnaryOperator before) {
	        Objects.requireNonNull(before);
	        return (int v) -> applyAsInt(before.applyAsInt(v));
	   }
	
	

}
