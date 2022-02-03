import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m=n-1;
		for(int i=1;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[j]>arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
			m--;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		sc.close();
	}

}
