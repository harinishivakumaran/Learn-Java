package exceptHandle;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		/*try {
			someMethod();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		someMethod2();
		
	}
	
	private static void someMethod2() throws RuntimeException{
		
	}
	
	private static void someMethod() throws InterruptedException {
		
		Thread.sleep(2000);
		
	}

}
