package mapInterface;
import java.util.*;
public class MapImplementations {

	public static void main(String[] args) {
		Map<String,Integer> map=Map.of("A",3,"B",5,"Z",10);
		Map<String,Integer> hashMap=new HashMap<>(map);
		System.out.println(hashMap); //{A=3, Z=10, B=5}
		System.out.println(hashMap.put("F", 5)); //returns null after adding the key with value
		//null -> the previous value of the key is null
		System.out.println(hashMap); //{A=3, Z=10, B=5, F=5}
		System.out.println(hashMap.put("Z", 11));//returns the previous value of "Z" and changes to 11
		System.out.println(hashMap);
	}

}
