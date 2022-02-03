package adcoops;
import java.util.*;
public class UniqueWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<String> set=new TreeSet<>();
		int index=1;
		System.out.println("Enter Student's Article");
		String art=sc.nextLine().toLowerCase();
		String[] s=art.split(" ");
		for(int i=0;i<s.length;i++) {
			if(s[i].charAt(s[i].length()-1)==',' || s[i].charAt(s[i].length()-1)=='.'
					|| s[i].charAt(s[i].length()-1)==':'
					|| s[i].charAt(s[i].length()-1)==';'
					|| s[i].charAt(s[i].length()-1)=='?'
					|| s[i].charAt(s[i].length()-1)=='!'
					) {
				s[i]=s[i].substring(0,(s[i].length()-1));
			}
			set.add(s[i]);
			
		}
		System.out.println("Number of words "+s.length);
		System.out.println("Number of unique  words "+set.size());
		System.out.println("The words are");
		for(String se:set) {
			System.out.println(index+"."+se);
			index++;
		}
		
		
		
	}

}
