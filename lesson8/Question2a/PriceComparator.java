package Assignments.lesson8.Question2a;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		
		return Double.compare(o1.getPrice(),o2.getPrice());
	}

}
