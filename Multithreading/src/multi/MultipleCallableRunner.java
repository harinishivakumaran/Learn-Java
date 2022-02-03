package multi;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		
		List<CallableTask> tasks = List.of(new CallableTask("Harini"),new CallableTask("Rini"),new CallableTask("Ha"));
		
		List<Future<String>> results = executorService.invokeAll(tasks); //waiting for all threads to complete 
		
		for(Future<String> r:results) {
			System.out.println(r.get());
		}
		
		executorService.shutdown();
	}

}
