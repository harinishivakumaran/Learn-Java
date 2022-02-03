package functionalProgramming;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOp {

	public static void main(String[] args) {
		
		int sumFromOneToTen=IntStream.range(1, 11).reduce(0, (a,b) -> a+b);
		System.out.println(sumFromOneToTen);
		//m.stream().max() this directly cannot be used as it needs a comparator
		//int maximum=List.of(23,45,62,15,66).stream().max((n1,n2) -> Integer.compare(n1, n2)); 
		//the above line gets an Optional back
		Optional<Integer> maximum=List.of(23,45,64,15,66).stream().max((n1,n2) -> Integer.compare(n1, n2));
		System.out.println(maximum); //Optional[66] 
		// Optional avoids null pointer exeptions.
		System.out.println(maximum.get()); //66
		int minimum=List.of(23,45,64,15,66).stream().min((n1,n2) -> Integer.compare(n1, n2)).get();
		System.out.println(minimum); //15
		//odd elements
		List<Integer> list=List.of(23,45,64,15,66);
		list.stream().filter(e -> e%2!=0).forEach(i -> System.out.print(i+" "));//23 45 15
		System.out.println();
		//List.of(23,45,64,15,66).stream().filter(e -> e%2!=0).forEach(i -> System.out.print(i+" ")); //or it can be like this also
		//to return a list in functional programming use collect()
		//even elements
		List<Integer> list1=list.stream().filter(e -> e%2==0).collect(Collectors.toList());
		System.out.println(list1);//[64, 66]
		//square of first ten elements
		//List<Integer> list2=Intstream().range(1,11).map(i -> i*i).boxed().collect(Collectors.toList());
		//Intstream throws error
		//System.out.println(list2);
		//IntStream.range(1, 11).map(i -> i*i).boxed().collect(Collectors.toList()) -possible in jshell
		System.out.println(IntStream.range(1, 11).map(i -> i*i).boxed().collect(Collectors.toList()));
		//boxed() creates a stream of integers.
	}

}
