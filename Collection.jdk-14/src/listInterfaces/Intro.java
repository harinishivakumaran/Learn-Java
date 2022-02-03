package listInterfaces;
import java.util.*;
public class Intro {

	public static void main(String[] args) {
		List<String> w=Arrays.asList("Hen","Cow","Horse");//immutable
		//w1.add("Duck"); //do not work.
		System.out.println(w);
		System.out.println(w.size());
		System.out.println(w.contains("Hen"));
		System.out.println(w.isEmpty());
		System.out.println(w.indexOf("Cow"));
		System.out.println(w.get(2));
		List<String> w1=new ArrayList<String>();//arrayLists are mutable.
		//List<String> w2=new LinkedList<String>();//linkedLists are mutable.
		//List<String> w3=new Vector<String>();//Vector are mutable.
		w1.add("Goat"); //add elements
		w1.add(0,"Lion");
		System.out.println(w1);
		w1.addAll(w);
		//w1.addAll(1,w); index position
		System.out.println(w1);
		w1.set(2, "Fox"); //modification operator //index position
		System.out.println(w1);
		w1.remove("Goat");
		System.out.println(w1);
		w1.remove(3); //specifying the index 
		System.out.println(w1);
		
		
	}

}
