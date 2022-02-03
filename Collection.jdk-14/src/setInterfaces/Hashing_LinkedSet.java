package setInterfaces;
import java.util.*;
public class Hashing_LinkedSet {

	public static void main(String[] args) {
		Set<Integer> nu=new LinkedHashSet<>();
		nu.add(765432);
		nu.add(765);
		nu.add(76543);
		nu.add(7654);
		nu.add(76);
		nu.add(7);
		System.out.println(nu);//storing in the order of insertion
		nu.add(654);
		System.out.println(nu);
		System.out.println(nu.add(765)); //false no duplicate elements stored. (since it is a set)

	}

}
