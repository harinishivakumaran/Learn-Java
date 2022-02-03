package mapInterface;
import java.util.*;
public class Treemap {

	public static void main(String[] args) {
		TreeMap<String,Integer> tm=new TreeMap<>();
		//implements NavigableMap
		tm.put("F",25);
		tm.put("Z",250);
		tm.put("L",15);
		tm.put("A",15);
		tm.put("B",25);
		tm.put("G",25);
		System.out.println(tm); //{A=15, B=25, F=25, G=25, L=15, Z=250}
		//sorted order based on the key.
		System.out.println(tm.higherKey("B")); //F -> Element greater than the specified key
		System.out.println(tm.higherKey("D")); //F
		System.out.println(tm.ceilingKey("B")); //B -> ceiling key returns greater than or equal to the key mentioned.
		System.out.println(tm.lowerKey("B"));//A
		System.out.println(tm.floorKey("B"));//B
		System.out.println(tm.firstEntry());//A=15
		System.out.println(tm.lastEntry());//Z=250
		System.out.println(tm.subMap("C", "Y"));//{F=25, G=25, L=15}
		System.out.println(tm.subMap("B","Z"));//{B=25, F=25, G=25, L=15} -> firstKey inclusive, lastKey exclusive.
		System.out.println(tm.subMap("B",true,"Z",true));//{B=25, F=25, G=25, L=15, Z=250} -> true boolean includes both keys
	}

}
