package concurrentCollections;

public class Counter {
	
	int i=0;
	synchronized public void increment() {
		i++; //i++ is not really a thread safe option.
//when this increment implemented by multiple threads, there is a chance that some of the updates 
																	//might be missed hence synchronized is used 
		//i++ is not atomic
		//three methods
		//1.get i
		//2. increment
		//3.set i
	}
	
	public int getI() {
		return i;
	}
	
	
	
}
