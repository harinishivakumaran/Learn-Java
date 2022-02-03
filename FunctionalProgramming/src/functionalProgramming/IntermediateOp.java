package functionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class IntermediateOp {

	public static void main(String[] args) {
		IntStream.range(1, 10).forEach(p -> System.out.print(p+" "));
		System.out.println();
		IntStream.range(1, 11).forEach(p -> System.out.print(p+" "));
		System.out.println();
		//square
		IntStream.range(1, 11).map(e -> e*e).forEach(p -> System.out.print(p+" "));
		System.out.println();
		//lowercase
		List.of("Apple","Ant","Bat").stream().map(s -> s.toLowerCase()).forEach(p -> System.out.print(p+" "));
		System.out.println();
		//length of each element
		List.of("Apple","Ant","Bat").stream().map(s -> s.length()).forEach(p -> System.out.print(p+" "));
		
	}

}
