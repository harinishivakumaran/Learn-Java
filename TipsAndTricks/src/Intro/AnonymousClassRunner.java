package Intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
	
}

public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> animals=new ArrayList<String>(List.of("Ant","Cat","Ball","Elephant"));
		Collections.sort(animals);
		System.out.println(animals);
		Collections.sort(animals,new LengthComparator());
		System.out.println(animals);
		Comparator<String> LengthComparator = new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return Integer.compare(str1.length(),str2.length());
			}	
		};
		//this way of creating class is called anonymous 
		//any class with no name - anonymous class
		Collections.sort(animals,
			LengthComparator
		);
		System.out.println(animals);
		//or
		
		Collections.sort(animals,
			new Comparator<String>() {
				@Override
				public int compare(String str1, String str2) {
					return Integer.compare(str1.length(),str2.length());
				}
			}
		);
		System.out.println(animals);
		
		
	}

}
