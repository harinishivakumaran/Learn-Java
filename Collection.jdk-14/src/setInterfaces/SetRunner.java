package setInterfaces;
import java.util.*;

public class SetRunner {
	public static void main(String[] args) {
		//unique - set
		//tree -> sorted order and no duplication.
		//LinkedHash -> inserted order
		//Hash -> no order, randomly stored.
		List<Character> ch=List.of('A','S','Z','A','D');
		Set<Character> treeSet=new TreeSet<>(ch);
		System.out.println(treeSet);
		Set<Character> linkedHashSet=new LinkedHashSet<>(ch);
		System.out.println(linkedHashSet);
		Set<Character> hashSet=new HashSet<>(ch);
		System.out.println(hashSet);
		
	}

}
