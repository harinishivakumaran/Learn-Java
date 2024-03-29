package concurrentCollections;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//to solve the concurrency problem while using synchronized method here locks are implemented.

public class BiCounterWithLock {
	
	private int i=0;
	private int j=0;

	Lock lockforI=new ReentrantLock();
	Lock lockforJ=new ReentrantLock();
	
	public void incrementI() { 
		//unlike synchronized methods here by using locks, one thread can access one method parallely 
				//without allowing same threads to use the same methods or other methods by locking them in one method 
		lockforI.lock();//Get Lock for I
		i++; //since the i++ is not atomic, atomic classes are used in BiCounterWithAtmoicInteger class
		//but for thread safety lock is preferred over atomic classes.
		lockforI.unlock();//Release Lock for I
	}
	
	public int getI() {
		return i;
	}
	
	public void incrementJ() {
		lockforJ.lock();//Get Lock for I
		j++;
		lockforJ.unlock();//Release Lock for I
	}
	
	public int getJ() {
		return j;
	}
	
	
	
}
