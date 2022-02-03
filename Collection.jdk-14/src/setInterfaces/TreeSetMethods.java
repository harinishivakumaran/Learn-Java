package setInterfaces;
import java.util.*;

public class TreeSetMethods {

	public static void main(String[] args) {
		//TreeSet also implements a navigable set interface 
		//i.e., it provides few a other operations which are traditionally not present in collections interface.
		//these kind of operations are only present where there is sorted data.
		TreeSet<Integer> n=new TreeSet<>(Set.of(65,54,34,12,99));
		System.out.println(n);
		System.out.println(n.floor(40)); //floor returns the element lower than 40
		System.out.println(n.floor(34)); //floor is inclusive which also includes 34
		System.out.println(n.lower(34)); //strictly lower than 34
		System.out.println(n.ceiling(36));//ceiling returns element greater than 36
		System.out.println(n.ceiling(34)); // since 34 is present it returns same 34
		System.out.println(n.higher(34));//higher returns number greater than 34
		System.out.println(n.subSet(20, 80));//subset returns between 20 to 80
		System.out.println(n.subSet(34, 54));//returns only 34 -> only lower limit is inclusive, the upper limit is exclusive.
		System.out.println(n.subSet(34, 65));
		System.out.println(n.subSet(34, true,65,true)); //include both lower and upper limit (both inclusive).
		System.out.println(n.subSet(34, false,65,false)); //both are exclusive (not included).
		System.out.println(n.headSet(50));//returns all elements upto 50
		System.out.println(n.tailSet(50));//returns all elements after 50
	}

}
