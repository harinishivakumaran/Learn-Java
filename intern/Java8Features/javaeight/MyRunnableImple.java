package javaeight;

public class MyRunnableImple implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread");
		}
	}

}
