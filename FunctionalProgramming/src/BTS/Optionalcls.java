package BTS;

import java.util.*;

public class Optionalcls {
//optional class avoids null pointer exceptions.
	public static void main(String[] args) {
		int a=List.of(23,45,64,15,66).stream().filter(i -> i%2==0).max((n1,n2) -> Integer.compare(n1, n2)).get();
		System.out.println(a);
		Optional<Integer> b=List.of(23,45,64,15,66).stream().filter(i -> i%2!=0).max((n1,n2) -> Integer.compare(n1, n2));
		System.out.println(b);//Optional[45]
		System.out.println(b.get());//45
		System.out.println(b.isPresent());//true 
		System.out.println(b.isEmpty());//false
		Optional<Integer> c=List.of(44,64,66).stream().filter(i -> i%2!=0).max((n1,n2) -> Integer.compare(n1, n2));
		System.out.println(c);//Optional.empty
		System.out.println(c.isEmpty());//true
		Optional<Integer> d=Optional.ofNullable(List.of(44,64,66).stream().filter(i -> i%2!=0).max((n1,n2) -> Integer.compare(n1, n2)).orElse(0));
		System.out.println(d);//Optional[0]
		
	}

}
