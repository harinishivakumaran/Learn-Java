package generic;

import java.util.ArrayList;

//T -> any type (capital letters preferred).

public class MyCustomList<T> {
	/*public class MyCustomList<T extends Number> {
		to limit certain datatypes -> extends is implemented.
		Here Number (class) applies to all Integer datatype (subclasses) thereby allowing only thosa datatypes to be passed.
		//Integer -> long,short,int,byte,float,double,etc.
	*/
	ArrayList<T> list=new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
	}
	public void removeElement(T element) {
		list.remove(element);
	}
	public String toString() {
		return list.toString();
	}
	public T get(int index) {
		return list.get(index);
	}
	
}
