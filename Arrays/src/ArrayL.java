import java.util.*;
public class ArrayL {
	public static void main(String[] args) {
		//ArrayList arr=new ArrayList();
		//this do not pass because the array type is not mentioned.
		//System.out.println(arr.append("Apple"))
		//below -> Generics
		ArrayList<String> arr=new ArrayList<String>(); //specify the type.
		arr.add("RRR");
		System.out.println(arr.toString());
		arr.add("fsw");
		System.out.println(arr.toString());
		arr.remove(0);//specifying the index position 
		System.out.println(arr.toString());
	}
}
