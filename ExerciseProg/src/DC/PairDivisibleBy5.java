package DC;
import java.util.*;
//DC 06.08.2020
public class PairDivisibleBy5 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt(),N=sc.nextInt();// 7 5 -> 5 //16 18->15
		int pairCount=0;
		ArrayList<Integer> arr=new ArrayList<>();
		for(int val1=1;val1<=M;val1++){ //1 to M 
		    for(int val2=1;val2<=N;val2++){ //1 to N
		        if((val1+val2)%5==0 && !arr.contains(val2)){
		            pairCount++;
		            arr.add(val2);
		            break;
		        }
		    }
		}
		System.out.print(pairCount);
		sc.close();
	}
}