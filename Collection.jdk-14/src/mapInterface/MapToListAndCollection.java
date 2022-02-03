package mapInterface;

import java.util.*;

public class MapToListAndCollection {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1,"Harini");
		map.put(2,"Sowbha");
		map.put(3,"Kasthuri");
		map.put(4,"Shiva");
		System.out.println(map);
		Set<Integer> set=map.keySet(); //the keys of the map can be put into a set
		Collection<String> cc=map.values(); //the values of the map can be put into collection 
		for(Integer i:set) {
			System.out.println(i+" "+map.get(i));
		}
	}

}
