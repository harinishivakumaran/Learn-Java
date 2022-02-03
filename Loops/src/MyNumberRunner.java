
public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber n=new MyNumber(5);
		boolean isPrime=n.isPrime();
		System.out.println("isPrime " + isPrime);
		int sum=n.sumUptoN();
		System.out.println("Sum uptoN is "+sum);
		int sumOfDivisors=n.sumOfDivisors();
		System.out.println("Sum of Divisors "+sumOfDivisors);
		n.printTrianglePattern();
	}

}
