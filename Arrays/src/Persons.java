import java.util.Arrays;

public class Persons {
	
	public static void main(String[] args) {
		Person[] persons=new Person[4];
		System.out.println(Arrays.toString(persons));//[null,null,null,null]
		persons[1]=new Person();
		System.out.println(Arrays.toString(persons));//[null, Person@15db9742, null, null]
		//Person@15db9742 it's an object location
		Person[] persons2= {new Person(), new Person(), new Person()};
		System.out.println(Arrays.toString(persons2));//[Person@6d06d69c, Person@7852e922, Person@4e25154f]
	}
}
