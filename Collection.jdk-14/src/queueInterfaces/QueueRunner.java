package queueInterfaces;
import java.util.*;

//to change the order, here custom comparator method is used
class StringLengthComparator implements Comparator<String>{ //sorts based on length of each element.
	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value1.length(), value2.length()); //increasing order
		//return Integer.compare(value2.length(), value1.length()); //reverse order (decreasing)
	}
	
}

public class QueueRunner {
	
	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<>(new StringLengthComparator());
		q.addAll(List.of("Zebra","Cat","Monkey"));
		System.out.println(q);
		System.out.println(q.poll()); //Cat //pops in ascending order.
		System.out.println(q.poll()); //Zebra
		System.out.println(q.peek()); //Monkey
		System.out.println(q.poll()); //Monkey
		System.out.println(q.poll()); //null
		q.toArray();
	}

}
