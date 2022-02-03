package threadexamples;

public class MyThreadd extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("I am a lazy Thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Got Interrupted");
		}
	}
}
