package DC;
//23-08-2020
import java.util.*;
public class countOfIceCream {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(); //5 29
		int[] a=new int[n+1];
		int amt=0,c=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt(); //5 10 12 4 15
		}
		Arrays.sort(a);
		for(int i:a) {
			amt+=i;
			if(amt<=m) {
				c+=1;
			}
			else {
				break;
			}
		}
		System.out.println(c-1); //3
		sc.close();
	}

}
