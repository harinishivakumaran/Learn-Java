package threadexamples;

public class ThreadPriority extends Thread{

	public static void main(String[] args) throws InterruptedException{
		
		ThreadPriority t1=new ThreadPriority();
		t1.setPriority(MAX_PRIORITY); // no guarentee
		t1.setName("t1");
		t1.start();
		
		ThreadPriority t2=new ThreadPriority();
		t2.setPriority(MIN_PRIORITY);
		t2.setName("t2");
		t2.start();
		
		
	}
	
	public void run() {
		System.out.println("Thread Name "+Thread.currentThread().getName());
	}
	
}
