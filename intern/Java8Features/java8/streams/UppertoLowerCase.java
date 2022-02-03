package java8.streams;

import java.util.*;
import java.util.stream.Collectors;
public class UppertoLowerCase {

	public static void main(String[] args) {
		List<String>l1=new ArrayList<>();
		l1.add("Harini");
		l1.add("Rini");
		l1.add("Kasthuri");
		l1.add("Shiva");
		System.out.println(l1);
		List<String> l2 = l1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		// map converts all the functions(methods)
		System.out.println(l2);
		//mapToInt() is available which always returns an integer
	}

}
