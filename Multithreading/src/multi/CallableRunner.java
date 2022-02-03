package multi;
//Callable tasks

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{
	
	private String name;
	
	public CallableTask(String name) {
		this.name=name;
	}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello"+name;
	}
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = executorService.submit(new CallableTask("Harini")); //used for callable threads.
		//Future is a promise that the message will get in later point of time.
		//other words waiting for the result only when callable task is completed and result is back.
		
		System.out.println("\nnew CallableTask(\"Harini\") executed");
		
		String welcomeMessage = welcomeFuture.get(); //wait for task to be completed
		System.out.println(welcomeMessage);
		
		System.out.println("\nMain Completed");
		
		executorService.shutdown();
	}

}
