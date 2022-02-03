package DC;
import java.util.*;
//DC-21-09-2020

public class ConsecutiveCountBin {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int N=sc.nextInt(); //5
			char[] bin=Integer.toBinaryString(N).toCharArray();
			String result="";
			int zeroCount=0;
			for(char ch:bin){
			    if(ch=='1'){
			        if(zeroCount!=0){
			            result+=String.valueOf(zeroCount).repeat(zeroCount);
			            zeroCount=0;
			        }
			        result+="1";
			    }
			    else
			    {
			        zeroCount++;
			    }
			}
			if(zeroCount!=0){
			    result+=String.valueOf(zeroCount).repeat(zeroCount);
			}
			//System.out.println(result); //111
			long num=Long.parseLong(result);
			System.out.print(Long.toBinaryString(num)); //1101111
			sc.close();
		}
}
