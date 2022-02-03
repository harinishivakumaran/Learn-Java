package multi;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		
		List<CallableTask> tasks = List.of(new CallableTask(" Harini"),new CallableTask(" Rini"),new CallableTask(" Ha"));
		
		String results = executorService.invokeAny(tasks); //return only one result back
		
		System.out.println(results);
		
		executorService.shutdown();
	}

}
