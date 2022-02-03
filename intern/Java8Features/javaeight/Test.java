package javaeight;

public class Test {
	public static void main(String[] args) {
		/*
		A a=new C();
		a.myMethod();
		*/
		A a = ()->System.out.println("Inside MyMethod");
		a.myMethod();
	}
}
