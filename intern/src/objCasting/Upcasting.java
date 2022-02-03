package objCasting;

class Parent //Class 1 //Parent class
{
	void show()// Function 
	{
	 System.out.println("Parent show method is called");
	}
}  
class Child extends Parent //Class 2 //Child class
{
 @Override 
 void show() 
 {
 System.out.println("Child show method is called");
 }
}
class Upcasting {//Class3 //Main class
	public static void main(String[] args) {
		// Creating a Parent class object 
	      // but referencing it to a Child class
	       Parent obj = new Child();
	       obj.show(); // Calling the show() method to execute
	}
}
