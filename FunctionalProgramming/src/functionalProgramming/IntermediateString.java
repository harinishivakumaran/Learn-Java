package functionalProgramming;

import java.util.List;

public class IntermediateString {
//Intermediate operations
	//many intermediate operations can be implemented with only one terminal operation for them.
	public static void main(String[] args) {
		List<Integer> n=List.of(456,334,22,776,200,443,776,32,334);
		//sort
		n.stream().sorted().forEach(e -> System.out.print(e+" "));
		System.out.println();
		//distinct elements
		n.stream().distinct().forEach(e -> System.out.print(e+" "));
		System.out.println();
		//sorted distinct elements
		n.stream().distinct().sorted().forEach(e->System.out.print(e+" "));
		System.out.println();
		//map each element to the square of that element
		n.stream().distinct().sorted().map(e -> e*e).forEach(e -> System.out.print(e+" "));
	}

}
