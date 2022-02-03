package annotation;

import java.util.ArrayList;
import java.util.List;
public class B {
	
	@SuppressWarnings(value = { "deprecation", "rawtypes" })
	public static void main(String[] args) {
		A a=new A();
		a.MyMethod();
		a.myMethodTo();
		a.number1=17;
		System.out.println(a);
		
		
		List l=new ArrayList();
		System.out.println(l);
	}

}
