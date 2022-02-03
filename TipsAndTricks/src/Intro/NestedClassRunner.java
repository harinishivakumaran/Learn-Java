package Intro;

class DefaultClass{
	
}

public class NestedClassRunner {
	int i;
	class InnerClass{
		public void method() {
			i=5;
		}
	}
	
	static class StaticNestedClass{
		public void method() {
			//i=10; not possible
		}
	}
	
	public static void main(String[] args) {
		//InnerClass ic=new InnerClass(); - not accessible without creating an instance 
		NestedClassRunner icc=new NestedClassRunner();
		InnerClass ic=icc.new InnerClass(); // now can create
		//InnerClass cannot exist without an instance of the enclosing class.
		//Only when the enclosing class instance exists, you can create an instance of the innerclass.
		//access the member variables of the enclosing class		
		
		StaticNestedClass snc=new StaticNestedClass();
		//whereas static nested class do not require instance of enclosing class
		//but cannot access the member variables of the enclosing class
	}

}
