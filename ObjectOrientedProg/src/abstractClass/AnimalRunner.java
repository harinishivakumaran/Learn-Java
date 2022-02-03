package abstractClass;

abstract class Animal{
	abstract void bark();
}
class Dog extends Animal{
	@Override
	public void bark() {
		System.out.println("Bow Bow");
	}
}
class Cat extends Animal{
	@Override
	public void bark() {
		System.out.println("Meow meow");
	}
}
public class AnimalRunner {
	public static void main(String[] args) {
		Animal[] animal= {new Dog(),new Cat()};
		for(Animal i:animal) {
			i.bark();
		}
	}
	//same code different behaviour executed -> polymorphism
	//multiple implementation of abstract class or interface -> polymorphism is a default consequence.

}
