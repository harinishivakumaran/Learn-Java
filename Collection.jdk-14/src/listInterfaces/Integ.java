package listInterfaces;
import java.util.*;

public class Integ {

	public static void main(String[] args) {
		List<Integer> numb=Arrays.asList(1,5,3,17,8);
		System.out.println(numb.indexOf(8));
		List<Integer> numbers=new ArrayList<>(numb);
		System.out.println((numbers.indexOf(8)));
		numbers.remove(Integer.valueOf(1));
		System.out.println(numbers);
		
		List<Integer> m=Arrays.asList(23,5,12,7,41,8,56,93);
		List<Integer> n=new ArrayList<>(m);
		Collections.sort(n);
		System.out.println(n);
				
		
	}

}
