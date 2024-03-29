package concurrentCollections;

//import java.util.Hashtable;
//import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		//find occurances of characters in the given string
		ConcurrentMap<Character, LongAdder> occurances=new ConcurrentHashMap<>();
		//Map<Character, LongAdder> occurances=new HashTable<>();
		
		String str="ABCD ABCD ABCD";
		for(char ch:str.toCharArray()) {
			occurances.computeIfAbsent(ch, ch1->new LongAdder()).increment();//atomic operation
			
			/*
			LongAdder longAdder=occurances.get(ch);
			if(longAdder==null) {
				longAdder=new LongAdder();
			}
			longAdder.increment();
			occurances.put(ch,longAdder);
			*/
		}
		System.out.println(occurances);

	}

}
