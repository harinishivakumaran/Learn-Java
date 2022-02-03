
import java.util.*;
public class MatrixPalindrome {
    private static int checkPal(int[] arr,int len){
        for(int ind=0;ind<len/2;ind++){
            if(arr[ind]!=arr[len-ind-1]){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt(),C=sc.nextInt(),isAllPalindrome=1; // 4 4
		int[][] matrix=new int[R][C];
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        matrix[row][col]=sc.nextInt(); // 1 2 2 1 // 2 5 5 2 // 2 5 5 2// 1 2 2 1
		    }
		}
        for(int row=0;row<R;row++){
            int[] rowWise=new int[C];
            int index=0;
            for(int col=0;col<C;col++){
                rowWise[index++]=matrix[row][col];
            }
            if(checkPal(rowWise,C)==0){
                isAllPalindrome=0;
            }
            
        }
        for(int col=0;col<C;col++){
            int[] colWise=new int[R];
            int index=0;
            for(int row=0;row<R;row++){
                colWise[index++]=matrix[row][col];
            }
            if(checkPal(colWise,R)==0){
                isAllPalindrome=0;
            }
            
        }
        System.out.print(isAllPalindrome==1 ? "YES":"NO"); //YES
        sc.close();
	}
}