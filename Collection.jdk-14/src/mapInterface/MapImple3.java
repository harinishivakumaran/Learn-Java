package mapInterface;
import java.util.*;
public class MapImple3 {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		//In map interface HashMap is the most efficient interface
		hm.put("Z",5);
		hm.put("A",15);
		hm.put("F",25);
		hm.put("L",250);
		System.out.println(hm); //{A=15, F=25, Z=5, L=250} -> unsorted (unordered)
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
		lhm.put("F",25);
		lhm.put("A",25);
		lhm.put("Z",15);
		lhm.put("L",250);
		System.out.println(lhm); //{F=25, A=25, Z=15, L=250} -> in the order of the insertion
		TreeMap<String,Integer> tm=new TreeMap<>();
		tm.put("F",25);
		tm.put("A",15);
		tm.put("Z",5);
		tm.put("L",250);
		System.out.println(tm); //{A=15, F=25, L=250, Z=5} -> sorted order based on the key.
		
	}

}
