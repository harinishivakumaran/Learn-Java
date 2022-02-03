package generic;
import java.util.ArrayList;
import java.util.List;
public class Limiting {
	//even methods can be implemented using generics
	static <X> X doubleValue(X v) {
		return v;
	}
	static <X extends List> void duplicate(X v) {
		//all methods are available
		v.addAll(v);
	}
	static Number sumOfNumberList(List<? extends Number> numbers) {
		//upper bounded wildcard -> helps in implementing common logic for all the list which are subclasses of Number.
		//? -> this is called the wildcard
		//any list of type extending number class is a valid list.
		double v=0.0;
		for(Number n:numbers) {
			v+=n.doubleValue();
		}
		return v;
	}
	static void addACoupleOfValues(List<? super Number> numbers) {
		//super -> lower bound wildcard -> helps to add a lot of different values of the types which are subtypes of Number.
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);	
	}	
	public static void main(String[] args) {
		
		List emp=new ArrayList<Number>();
		addACoupleOfValues(emp);
		System.out.println(emp);
		
		System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
		System.out.println(sumOfNumberList(List.of(1.1,2.2,3.3,4.4,5.5)));
		System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l)));
		
		String v=doubleValue(new String());
		Integer v1=doubleValue(Integer.valueOf(5));
		ArrayList li=doubleValue(new ArrayList());
		
		ArrayList<Integer> num=new ArrayList<>(List.of(1,2,3));
		//LinkedList<Integer> num=new LinkedList<>(List.of(1,2,3)); //applicable to all types.
		duplicate(num);
		System.out.println(num);
	}
}