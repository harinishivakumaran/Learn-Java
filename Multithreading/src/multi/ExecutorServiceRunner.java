package multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
	
	//for controlling the execution of he thread
	
	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newSingleThreadExecutor(); 
		//only execute one thread at a time.
		executorService.execute(new Task1());
		//only after task1 completed execution task2 starts execution.
		executorService.execute(new Thread(new Task2()));
		
		
		//Task3
		System.out.println("Task3 kicked");
		for(int i=301;i<=399;i+=10)
			System.out.print(i+" ");
		System.out.println("\nTask3 Done ");
		

		executorService.shutdown();
	}

}
