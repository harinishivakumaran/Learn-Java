package BTS;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
//import java.util.function.Predicate;
//import java.util.stream.Stream;
//import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer>{ //filter()

	@Override
	public boolean test(Integer number) { //Predicate evaluates and returns true or false.
		return number%2==0;
	}
	//test is the only unimplemented method, that's why we are mentioning a condition in the filter.
}

class SystemOutConsumer implements Consumer<Integer>{ //forEach()

	@Override
	public void accept(Integer t) {
		System.out.print(t+" ");
	}
}

class NumberSquareMapper implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer n) {
		return n*n;
	}
}

public class LambdaBTSRunner {
	//BTS - Behind The Screens - the operation behind the lambda function's methods like forEach(),filter()
	public static void main(String[] args) {
		
		List.of(34,22,54,23).stream()
					.filter(i -> i%2==0)
						.forEach(e -> System.out.print(e+" "));
		
		System.out.println();
		List.of(34,22,54,23).stream()
					.filter(new EvenNumberPredicate())
						.forEach(e -> System.out.print(e+" "));
		
		System.out.println();
		List.of(34,22,54,23).stream()
					.filter(new EvenNumberPredicate())
						.forEach(new SystemOutConsumer());
		
		System.out.println();
		List.of(34,22,54,23).stream()
					.map(n -> n*n)
						.forEach(e -> System.out.print(e+" "));

		System.out.println();
		List.of(34,22,54,23).stream()
					.map(new NumberSquareMapper())
						.forEach(e -> System.out.print(e+" "));

		
		
		//Stream<T> filter(Predicate<? super T> predicate);
		//Predicate is a functional interface
		//boolean test(t,T); //Predicate interface has a method test.
		//Predicate is a filter
		
		//forEach is a consumer
		//void forEach(Consumer<? super T> action);
		//void accept(T t) //method
		
		//map()
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
		//R apply(T t);

	}

}
