
public class MyNumber {
	private int a;
	public MyNumber(int a) {
		this.a=a;

	}
	public boolean isPrime() {
		if(a<2) {//guard check
			return false;
		}
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	public int sumUptoN() {
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum+=i;
		}
		return sum;
	}
	public int sumOfDivisors() {//except the first and last elements, other elements are added.
		int sum=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}			
		return sum;
	}
	public void printTrianglePattern() {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {//loop within a loop
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
