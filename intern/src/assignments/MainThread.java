package assignments;

class EvenNumbersThread extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

class OddNumbersThread extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}

public class MainThread {

	public static void main(String[] args) {
		EvenNumbersThread e = new EvenNumbersThread();
		OddNumbersThread o = new OddNumbersThread();
		e.start();
		o.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
