import java.util.*;
public class prime {
	private static boolean isPrime(int f) {
		if(f<=1) return false;
		if(f<=3) return true;
		if(f%2==0 || f%3==0) return false;
		for(int i=5;i*i<=f;i+=6) {
			if(f%i==0 || f%(i+2)==0) return false;
		}
		return true;
	}
	private static int nprime(int n) {
		int p=n+1,q=0;
		boolean f=false;
		while(!f) {
			if(isPrime(p)) {
				q=p;
				f=true;
			}
			p++;
		}
		return q;
	}
	private static int pprime(int n) {
		int p=n-1,q=0;
		boolean f=false;
		while(!f) {
			if(isPrime(p)) {
				q=p;
				f=true;
			}
			p--;
		}
		return q;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0) {
			int n=sc.nextInt();
			int prev=pprime(n);
			int next=nprime(n);
			System.out.println(next+prev);
		}
		sc.close();
	}

}
