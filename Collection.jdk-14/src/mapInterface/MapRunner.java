package mapInterface;
import java.util.*;
public class MapRunner {

	public static void main(String[] args) {
		String str="This is an awesome occasion. " + "This has never happened before.";
		//Identify how many times each character is repeated.
		Map<Character,Integer> occurances=new HashMap<>();
		char[] ch=str.toCharArray();
		for(char c:ch) {
			//Get the character
			Integer i=occurances.get(c);
			//if it is not there, then initialize to one 
			if(i==null) {
				occurances.put(c, 1);
			}
			//else increment the count
			else {
				occurances.put(c, i+1);
			}
		}
		System.out.println(occurances);
		
		//Identify how many times each string is repeated.
		Map<String,Integer> stroccurances=new HashMap<>();
		String[] ch1=str.split(" ");
		for(String cc:ch1) {
			//Get the character
			Integer i=stroccurances.get(cc);
			//if it is not there, then initialize to one 
			if(i==null) {
				stroccurances.put(cc, 1);
			}
			//else increment the count
			else {
				stroccurances.put(cc, i+1);
			}
		}
		System.out.println(stroccurances);
	}

}
