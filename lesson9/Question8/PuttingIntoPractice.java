package Assignments.lesson9.Question8;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingIntoPractice{
	
	public static Stream<Transaction> getStream(List<Transaction> transactions) {
		
		return transactions.stream();
	}
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		
		getStream(transactions).filter(x->x.getYear()==2011).sorted(Comparator.comparing((Transaction x)->x.getValue()));


        
        // Query 2: What are all the unique cities where the traders work?
		
		getStream(transactions).map(Transaction::getTrader).map(y->y.getCity()).distinct();
        

        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> tt=	getStream(transactions).map(Transaction::getTrader).filter(y->y.getCity().equals("Cambridge"))
		.sorted(Comparator.comparing((Trader t)->t.getName())).collect(Collectors.toList());
        
        // Query 4: Return a string of all traders names sorted alphabetically.
	String x=getStream(transactions).map(Transaction::getTrader).map(Trader::getName).distinct().sorted().collect(Collectors.joining(" "));
System.out.println(x);
       
// Query 5: Are there any trader based in Milan?
        getStream(transactions).filter(t->t.getTrader().getCity().equals("Milan")).findAny();
    
	// Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
	getStream(transactions).filter(t->t.getTrader().getCity().equals("Milan")).forEach(m->m.getTrader().setCity("Cambridge"));
	System.out.println(transactions);
        
        // Query 7: What's the highest value in all the transactions?
	int d=getStream(transactions).max(Comparator.comparing((Transaction temp)->temp.getValue())).map(temp1->temp1.getValue()).get();
	
	int highestValue=getStream(transactions).map(Transaction::getValue)
    .reduce(0, Integer::max);
System.out.println(d);      
    }
}
