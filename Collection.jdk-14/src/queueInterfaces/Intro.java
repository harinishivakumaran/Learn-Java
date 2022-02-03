package queueInterfaces;
import java.util.*;
public class Intro {

	public static void main(String[] args) {
		//PriorityQueue -> priority is in natural order
		Queue<String> q=new PriorityQueue<>();
		System.out.println(q.poll());//null -> since the queue is empty
		q.offer("Bat");
		q.addAll(List.of("Cat","Mouse","Giraffe"));
		System.out.println(q);
		System.out.println(q.poll());//returns the first element (picks after arranging them in ascending order) 
		//and removes from the queue
		System.out.println(q);//the output doesn't contain Bat
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}

}
