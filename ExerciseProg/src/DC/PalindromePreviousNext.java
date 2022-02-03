package DC;
//20-08-2020
import java.util.*;
public class PalindromePreviousNext {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] str=sc.nextLine().toCharArray();
		int len=str.length,flag=0;
		for(int index=0;index<len/2;index++){
		    char ch1=str[index],ch2=str[len-index-1];
		    if(Math.abs(ch1-ch2)>2){
		        System.out.print("NO");
		        flag=1;
		        break;
		    }
		}
		if(flag==0){
		    System.out.print("YES");
		}
		sc.close();
	}

}
