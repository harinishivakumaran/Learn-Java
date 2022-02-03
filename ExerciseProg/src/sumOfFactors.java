import java.util.*;
public class sumOfFactors {
	private static int factor(int n) {
		int l=0;
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				int k=j;
				while(k>0) {
					l+=k%10;
					k/=10;					
				}
			}
		}
		return l;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0) {
			int n=sc.nextInt();
			int s=factor(n);
			if(n%s==0) {
				System.out.println("yes");
			}
			else {
				System.out.println("No");
			}
		}
		sc.close();
	}
}
