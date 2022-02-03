package setInterfaces;
//set is not positional access.
import java.util.*;

public class Intro {

	public static void main(String[] args) {
		Set<String> s=Set.of("Apple","Ball","Cat");
		System.out.println(s);
		//set.add("Apple");//this does not work since Set is an immutable Collection
		//but mutable with hashset
		Set<String> hashSet=new HashSet<>(s);
		//while using hashSet, the order of the original set will be lost.
		System.out.println(hashSet);
		hashSet.add("Dog");
		System.out.println(hashSet.add("Ball"));//false since "Ball" is already present in the set. 
		//no duplicates
		System.out.println(hashSet);		
		
	}

}
