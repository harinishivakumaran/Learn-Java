package javaInterfaces;

interface Flyable{
	void fly();
}

class Bird implements Flyable{
	public void fly() {
		System.out.println("With wings");
	}
}
class Aeroplane implements Flyable{
	public void fly() {
		System.out.println("With fuel");
	}
}
/*
An interface to represent the common method between two completely different stuff.
Interface represents common actions that can be performed.
 */
public class FlyableRunner {
	public static void main(String[] args) {
		Flyable[] flyingObjects= {new Bird(),new Aeroplane()};
		for(Flyable i : flyingObjects)
		{
			i.fly();
		}
		/*
		Bird b=new Bird();
		b.fly();
		Aeroplane a=new Aeroplane();
		a.fly();
		*/
	}
}
