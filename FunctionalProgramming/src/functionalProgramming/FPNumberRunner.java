package functionalProgramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		
		List<Integer> list=List.of(4,6,8,13,3,15);
		
		/*list.stream().forEach(element -> System.out.println(element));*/
		
		int s = fpSum(list);
		System.out.println(s);
		
		int s1 = fpOddSum(list);
		System.out.println(s1);
		
		int sum = normalSum(list);
		System.out.println(sum);
		
	}
	//stream is the source of objects of specific class
	
	private static int fpOddSum(List<Integer> list) {
		//declarative style of programming.
		return list.stream().filter(number -> number%2!=0).reduce(0,(number11,number21) -> number11+number21);
	}
	
	private static int fpSum(List<Integer> list) {
		return list.stream().reduce(0,(number1,number2 ) -> {
			System.out.println(number1+" "+number2);//method is created
			return number1+number2;
					} );
	}
	
	private static int normalSum(List<Integer> list) {
		//imperative style of programming
		int sum=0;
		for(int i:list) {
			sum+=i; //mutations -> the value of the sum is changing
		}
		return sum;
	}

}
