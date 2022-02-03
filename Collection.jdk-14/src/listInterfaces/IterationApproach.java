package listInterfaces;
import java.util.*;

public class IterationApproach {
	
	public static void main(String[] args) {
		List<String> w=Arrays.asList("Rat","Cow","Cat","Bat","Horse");
		List<String> arr=new ArrayList<String>();
		arr.add("Goat");
		arr.addAll(w);
		//to apply specific condition use enhance for loop
		//modification enhanced for loops not prefered
		for(String k:arr) {
			if(k.endsWith("at"))
				System.out.print(k+" ");
		}
		System.out.println();
		//to remove specific elements use Iterator method
		Iterator<String> arrIterate=arr.iterator();
		while(arrIterate.hasNext()) {
			if(arrIterate.next().endsWith("at")) {
				arrIterate.remove();
			}
		}
		System.out.println(arr);

	}

}
