package multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	
	private int num;
	
	public Task(int num){
		this.num=num;
	}
	
	public void run() {
		System.out.println("\n Task "+num+" Started");
		for(int i=num*100;i<=num*100+99;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask "+num+" Done");
	}
}

public class MultipleThreadRunner {

	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newFixedThreadPool(3); //allows specified number of active threads. 
		//executes '3' (mentioned) thread at a time. 
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
				
		//Task3
		System.out.println("Task3 kicked");
		for(int i=301;i<=399;i+=10)
			System.out.print(i+" ");
		System.out.println("\nTask3 Done ");

		executorService.shutdown();
	}

}
