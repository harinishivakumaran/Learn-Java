package mapInterface;
import java.util.*;
public class Intro {

	public static void main(String[] args) {
		//Map<Key, value> variableName=Map.of();
		Map<String,Integer> m=Map.of("D",4,"H",6,"S",10);
		//since Map.of method (immutable) is used, new key, values cannot be added. 
		//System.out.println(m.put("R", 1)); //throws error.
		System.out.println(m);
		System.out.println(m.get("S")); //10
		System.out.println(m.get("F")); // returns null -> key is not present in the map
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.containsKey("S"));
		System.out.println(m.containsValue(4));
		System.out.println(m.keySet());//[H, D, S] -> returns the key alone.
		System.out.println(m.values());//[10, 6, 4] -> returns the value alone.
	}

}
