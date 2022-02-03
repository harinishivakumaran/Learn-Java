package java8.defaultmethods;

public class Test {

	public static void main(String[] args) {
		A a=new B();
		a.m1(); //m1 inside B - runtime polymorphism
	}

}
