package DC;
import java.util.*;
//DC 09.08.2020
public class InterlaceVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		ArrayList<Character> vowel=new ArrayList<>();
		ArrayList<Character> consonant=new ArrayList<>();
		for(char ch:sc.nextLine().toCharArray()){ //skillrack
		    if("AEIOUaeiou".contains(ch+"")){
		        vowel.add(ch);
		    }
		    else
		    {
		        consonant.add(ch);
		    }
		}
		Collections.reverse(consonant); //reverse consonants
		int maxLen=Math.max(vowel.size(),consonant.size());
		for(int index=0;index<maxLen;index++){
		    if(index<vowel.size()){
		        System.out.print(vowel.get(index));
		    }
		    if(index<consonant.size()){
		        System.out.print(consonant.get(index));
		    }
		} //output -> ikacrllks
		sc.close();
	}
}