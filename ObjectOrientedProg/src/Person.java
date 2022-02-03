//inheritance 
public class Person extends Object{ 
	//Object (extends) is generally present for all classes even it is not extended. (default)
	//Object is the top of inheritance hierarchy.
	//Person -> super (or parent) class of the parent (subclass) class.
	
	private String name;
	private int phonenumber;
	private String email;
	
	public Person(String name) { //explicit contructor with argument name
		System.out.println("Person");
		this.name=name;
	}
	
	/*public Person(String name) {
		super(); //default calling
		this.name = name;
	}*/
	public String getName() {
		return name;
	}
	/*public void setName(String name) {
		this.name = name;
	}*/
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	//inbuilt toString method in object class is
	//public String toString(){
		//return getClass().getName()+"@"+Integer.toHexString(hashCode());
	//}
	//output->Person@6d06d69c //to change @ implement 
	public String toString(){
		return name+"#"+email+"#"+phonenumber;
		// or return getClass().getName()+"#"+Integer.toHexString(hashCode());
	}
	//now output->Person#6d06d69c
	//that is overriding the method given by the class object (superclass).
	//override the implementation provided by the superclass inside the subclass. 
	//here the toString method of the super class Object is override by the person class.
}


