package functionalProgramming;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer n) {
		System.out.println(n);
	}
	
	public static boolean isEven(Integer n) {
		return n%2==0;
	}
	
	public static void main(String[] args) {
		
		List.of("Ant","Bat","Cat","Dog","Elephant").stream().map(s->s.length()).forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		//this is the method shortcut for above operation.
		List.of("Ant","Bat","Cat","Dog","Elephant").stream().map(s->s.length()).forEach(System.out::println);

		//another shortcut
		//this is a method reference - makes code readable.
		//static methods as well as instance methods can be replaced using call method reference.
		List.of("Ant","Bat","Cat","Dog","Elephant").stream().map(String::length).forEach(MethodReferencesRunner::print);
		
		Integer m=List.of(23,45,66,34).stream().filter(i-> i%2==0).max((a,b) -> Integer.compare(a,b)).orElse(0);
		System.out.println(m);
		
		Integer mm=List.of(23,45,67,34).stream().filter(MethodReferencesRunner::isEven).max(Integer::compare).orElse(0);
		System.out.println(mm);
		
		
	}

}
