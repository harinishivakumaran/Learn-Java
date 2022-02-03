package functionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class Functionnn {
	
	//Functions are first class citizens.
	
	public static void main(String[] args) {
		
		//Storing functions in variables.
		Predicate<? super Integer> oddPredicate = i -> i%2!=0;
		Predicate<? super Integer> evenPredicate = createEvenPredicate(); 
		//passing functions to methods
		//returning functions from methods.
		
		List.of(34,22,54,23).stream()
			.filter(evenPredicate)
				.forEach(e -> System.out.print(e+" "));

		List.of(34,22,54,23).stream()
			.filter(oddPredicate)
				.forEach(e -> System.out.print(e+" "));

		
	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return i -> i%2==0;
	}

}
