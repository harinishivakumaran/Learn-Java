package DC;
import java.util.*;
//DC -> 21-08-2020
public class RotateMatrix {
	//by X degrees.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n+1][n+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int x=sc.nextInt();
		if(x%90==0) {
			for(int k=0;k<x/90;k++) { 
				//transpose
				for(int i=0;i<n;i++) {
					for(int j=i;j<n;j++) {
						int t=a[i][j];
						a[i][j]=a[j][i];
						a[j][i]=t;
					}
				}
				//reversing rows
				for(int i=0;i<n;i++) {
					for(int j=0;j<n/2;j++) {
						int t=a[i][j];
						a[i][j]=a[i][n-j-1];
						a[i][n-j-1]=t;
					}
				}
			}
			//printing the rotated matrix
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}	
		else System.out.println("INVALID");
		sc.close();
	}

}
