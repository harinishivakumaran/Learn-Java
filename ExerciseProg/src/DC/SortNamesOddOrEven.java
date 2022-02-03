package DC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNamesOddOrEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(); //4
		int sum=0,val=0;
		for(int ctr=0;ctr<N;ctr++){
		    val=sc.nextInt(); //1234 967 20043 100
		    List<Integer> arr=new ArrayList<>();
		    int unitDigit=val%10;
		    val/=10;
		    while(val>0){
		        arr.add(val%10);
		        val/=10;
		    }
		    if(unitDigit%2==0){
		        Collections.sort(arr,Collections.reverseOrder());
		    }
		    else
		    {
		        Collections.sort(arr);
		    }
		    int res=0;
		    for(int digit:arr){
		        res=res*10+digit;
		    }
		    res=res*10+unitDigit;
		    sum+=res;
		}
		System.out.print(sum); //4254
		sc.close();
	}

}
