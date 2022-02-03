package DC;
import java.util.*;
//19.10.2020
public class SubstringCountWithoutVowels {
	private static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] S=sc.nextLine().toCharArray(); //apple
		int count=0;
		for(int ind1=0;ind1<S.length-1;ind1++){
		    for(int ind2=ind1+1;ind2<S.length;ind2++){ 
		        int flag=0;
		        for(int index=ind1;index<=ind2;index++){ //substring
		            if(isVowel(S[index])){ 
		                flag=1;
		            }
		        }
		        if(flag==0){ //no vowels increment
		            count++;
		        }
		    }
		}
		System.out.print(count); //3
		sc.close();
	}
}
