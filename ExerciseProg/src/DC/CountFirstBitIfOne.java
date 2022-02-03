package DC;
import java.util.*;
public class CountFirstBitIfOne {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(); // input -> 10 output-> 3
		int count=0;
		int len=(Integer.toBinaryString(N)).length();
		for(int ctr=1;ctr<=N;ctr++){ // 1 to 10
		    String binary=Integer.toBinaryString(ctr); //binary rep of ctr
		    int lenOfBinary=binary.length();
		    if(lenOfBinary==len && binary.charAt(0)=='1'){ //if the first value of bin is '1'
		        count++;
		    }
		}
		System.out.print(count);
		sc.close();
	}
}