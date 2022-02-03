package setInterfaces;
import java.util.*;

public class Hashing_TreeSet {

	public static void main(String[] args) {
		Set<Integer> tr=new TreeSet<>(); // sorting and don't careabout insertion order.
		tr.add(765432);
		tr.add(76);
		tr.add(765);
		tr.add(7677);
		tr.add(765400);
		System.out.println(tr); //sorted order
		System.out.println(tr.add(765)); //false -> no duplication
		
	}

}
