package Assignments.lesson4.Question1;

public final class PayCheck {
	
	private final double grossPay;
	private  final double fica;
	private final double StateTax;
	private final double tax ;
	@Override
	public String toString() {
		return "PayStub: "+" \n"+" GrossPay=" + grossPay + "\n fica=" + fica + "\n StateTax=" + StateTax + "\n tax=" + tax
				+ "\n Medicare=" + Medicare + "\n SocialSecurity=" + SocialSecurity + "\n NET PAY="+getNetPay()+"\n";
	}

	private final double Medicare;
	private final double SocialSecurity;
	
	
	public PayCheck(double grossPay) {
		
		this.grossPay = grossPay;
		fica= 0.23;
		StateTax= 0.05;
		tax = 0.01;
		Medicare=  0.03;
		 SocialSecurity= 0.075;
	}

	public double getNetPay() {
		
		return grossPay-(grossPay*(fica+StateTax+tax+Medicare+SocialSecurity));
	}
	
	public void print() {
		getNetPay();
	}

}
