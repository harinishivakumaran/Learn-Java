package intern;

import java.util.*;
import java.math.*;

public class LeastOffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n+1];
		String[] arr1=new String[n+1];
		String[] name=new String[n+1];
		Integer[] rate=new Integer[n+1];
		Integer[] dis=new Integer[n+1];
		Integer[] offer=new Integer[n+1];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		int m=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			String[] s=arr[i].split(",",3);
			name[i]=s[0];
			rate[i]=Integer.parseInt(s[1]);
			dis[i]=Integer.parseInt(s[2]);
			double d=(dis[i]*1.0)/100;
			double dd=1-d;
			offer[i]= (int) (rate[i]*d);
			//System.out.println(offer[i]);
			m=Math.min(m, offer[i]);
			//System.out.println(m);
		}
		for(int i=0;i<n;i++) {
			if(offer[i]==m) {
				System.out.println(name[i]);
			}
		}
	}
}
