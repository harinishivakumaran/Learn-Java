package concurrentCollections;

import java.util.concurrent.atomic.AtomicInteger;

//to solve the atmoic problem here atomic classes are used.

public class BiCounterWithAtomicInteger {
	
	private AtomicInteger i=new AtomicInteger();
	private AtomicInteger j=new AtomicInteger();

	public void incrementI() { 
		i.incrementAndGet(); //increment as operator for thread safety.
	}
	
	public int getI() {
		return i.get();
	}
	
	public void incrementJ() {
		j.incrementAndGet();
	}
	
	public int getJ() {
		return j.get();
	}
	
	
	
}
