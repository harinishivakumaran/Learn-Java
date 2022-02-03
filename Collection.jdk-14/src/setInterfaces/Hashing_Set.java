package setInterfaces;
import java.util.*;

public class Hashing_Set {

	public static void main(String[] args) {
		Set<Integer> n=new HashSet<>(); //don't care about insertion and sort order
		n.add(765432);
		n.add(76543);
		n.add(7654);
		n.add(765);
		n.add(76);
		n.add(7);
		System.out.println(n); //elements are randomly printed.
	}

}
