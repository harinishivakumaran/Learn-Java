package Intro;

class Client{
	private int id;
	
	public Client(int id) {
		super();
		this.id=id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	//if id's are same the hashcode will be the same
	//hashcode distributes evenly among the buckets for hashing
	//hashcode must not change until the values changes
	
	@Override
	public boolean equals(Object that) { 
		if (this == that)
			return true;
		if (that == null)
			return false;
		if (getClass() != that.getClass())
			return false;
		Client other = (Client) that;
		if (id != other.id)
			return false;
		return true;
	}
	//the difference here is we are overriding the equals to compare with the value of the object not the instance
	
	
}

public class EqualsRunner {

	public static void main(String[] args) {
		Client c1=new Client(1);
		Client c2=new Client(1);
		Client c3=new Client(2);
		/*
		//before overriding the equals method in the Client class
		System.out.println(c1.equals(c2)); //false
		//compare the object instance and not the value
		System.out.println(c1.equals(c1)); //true
		*/
		//after overriding
		System.out.println(c1.equals(c2)); //true
		System.out.println(c2.equals(c2)); //true
		System.out.println(c1.equals(c3)); //false
		
		
		
		
	}

}
