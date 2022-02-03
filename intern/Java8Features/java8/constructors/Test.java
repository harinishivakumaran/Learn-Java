package java8.constructors;

public class Test {
	public static void main(String[] args) {
		MyInterface f1 =  s->new MyClass(s);
		f1.get("Using lambdas");
		
		
		//constructor mapping
		MyInterface f2 = MyClass::new;
		f2.get("Using Constructor mapping"); 
	}
	
}
