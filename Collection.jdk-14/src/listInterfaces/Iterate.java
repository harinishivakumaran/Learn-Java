package listInterfaces;
import java.util.*;
public class Iterate {

	public static void main(String[] args) {
		List<String> w=Arrays.asList("Hen","Cow","Horse");//immutable
		List<String> arr=new ArrayList<String>();//mutable
		arr.add("Go");
		arr.addAll(w);
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		for(String word:arr) {
			System.out.print(word+" ");
		}
		System.out.println();
		//List has iterator method
		Iterator<String> arrIterator=arr.iterator();
		while(arrIterator.hasNext()) { //hasNext() checks for next element
			System.out.print(arrIterator.next()+" "); //next() prints the next element.
		}
		
		
	}

}
