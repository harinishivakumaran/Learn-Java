package newdemoproj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Integer[] arr= {34,54,22,45};
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		System.out.println(set);
		Set<Integer> n=new HashSet<>(); //don't care about insertion and sort order
		n.add(765432);
		n.add(76543);
		n.add(7654);
		n.add(765);
		n.add(76);
		n.add(7);
		System.out.println(n); 
		Set<Integer> tr=new TreeSet<>(n); // sorting and don't careabout insertion order.
		System.out.println(tr);
		Set<Integer> lh=new LinkedHashSet<>(set); // insertion order
		System.out.println(lh); 
	}

}
