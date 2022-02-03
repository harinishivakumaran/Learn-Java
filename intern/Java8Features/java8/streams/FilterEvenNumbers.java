package java8.streams;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FilterEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		
		for(int i=0;i<=10;i++) {
			l1.add(i);
		}
		System.out.println(l1);
		
		/*
		List<Integer> l2=new ArrayList<>();
		for(Integer i:l1) {
			if(i%2==0) {
				l2.add(i);
			}
		}
		System.out.println(l2);
		*/
		System.out.println("forEach operation");
		l1.stream().filter(i->i%2==0).forEach(n->System.out.print(n+",")); //forEach is the terminal operation.
		System.out.println();
		int s=l1.stream().filter(i->i%2==0).mapToInt(i->i).sum(); //mapToInt always return an Integer
		
		l1.stream().filter(i->i%2==0).map(i->i+i).forEach(i->System.out.print(i+" ")); //0 4 8 12 16 20 
		
		//methods like sum, count, forEach are terminal operators.
		System.out.println("\nSum of all the even numbers"+s);
		List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		Stream<Integer> d=l1.stream().filter(i->i%2==0);
		System.out.println("\n"+d);
		//configuring - filter ; processing - collect (terminal operation)
		
		System.out.println(l2);
		long count = l1.stream().filter(i->i%2==0).count();
		System.out.println("Number of even numbers are: "+count);
		
		Comparator<Integer> c = (i1,i2) -> i2.compareTo(i1);
		List<Integer> l3=l1.stream().sorted(c).collect(Collectors.toList());
		System.out.println(l3);
		
		List<Integer> l4=l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l4);
		
		Comparator<Integer> comp = (i1,i2) -> i1.compareTo(i2);
		Integer max = l1.stream().max(comp).get();
		System.out.println(max);
		Integer min = l1.stream().min(comp).get();
		System.out.println(min);
		
		l1.stream().forEach(i -> System.out.println(i));
		
	}

}
