package DT;
import java.util.*;
//24-08-2020
public class UShapedMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(),c = sc.nextInt(),row = 0,col = 0;//4 4
		int[][] a = new int[r][c];
		for(int i = 0;i < r; i++)
		for(int j = 0;j < c; j++)
		a[i][j] = sc.nextInt();
		/*
		34 22 11 67 
		8 45 33 54
		90 3 29 23
		94 26 63 77
		 */
		while(row < r && col < c) {
		    for(int i = row;i < r; i++)
		    System.out.print(a[i][col]+" ");
		    col++;
		    for(int i = col;i < c; i++)
		    System.out.print(a[r-1][i]+" ");
		    r--;
		    for(int i = r-1; i>= row; i--)
		    System.out.print(a[i][c-1]+" ");
		    c--;
		    System.out.println();
		}
		/*
		34 8 90 94 26 63 77 23 54 67 
		22 45 3 29 33 11 
		*/
		sc.close();
	}
}
