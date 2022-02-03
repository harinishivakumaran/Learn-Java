package threadexamples;

public class MultiThreaded extends Thread {

	public static void main(String[] args) throws InterruptedException{
		MultiThreaded mt=new MultiThreaded();
		mt.start();
		Thread ct=Thread.currentThread();
		System.out.println("Thread name is "+ct.getName());
		
		/*
		for(int j=1;j<=200;j++){
			System.out.println("j: "+j+"\t");
			Thread.sleep(1000);
		}
		*/
	}
		public void run() {
			Thread ct=Thread.currentThread();
			ct.setName("Print 200 numbers");
			System.out.println("Thread name is "+ct.getName());
			
			/*for(int i=1;i<=200;i++) {
				System.out.println("i: "+i+"\t");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println("Child Throw Exiting");
				}
			}*/
			
		}
		 
	

}
