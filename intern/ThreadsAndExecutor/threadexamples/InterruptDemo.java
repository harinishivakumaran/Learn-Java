package threadexamples;

public class InterruptDemo {

	public static void main(String[] args) {
		MyThreadd t=new MyThreadd();
		t.start();
		t.interrupt();
		System.out.println("End of the main method");
	}

}
