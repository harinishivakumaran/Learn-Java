package executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		CheckProcessorTask[] cps= {new CheckProcessorTask("ATM"),
				new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"),
				new CheckProcessorTask("Web")};
		
		ExecutorService service=Executors.newFixedThreadPool(2);
		for(CheckProcessorTask cp:cps) {
			service.submit(cp);
		}
		service.shutdown();
	}

}
