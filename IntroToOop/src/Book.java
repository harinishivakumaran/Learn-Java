
public class Book {
	private int noOfCopies;
	
	public int getNoOfCopies() {
		return noOfCopies;
	}
	
	Book(){
		this(88); // setting default constructor;
	}
	
	Book(int noOfCopies){ //same name of the class Book //constructor is a special method
		this.noOfCopies=noOfCopies; //no return type required
	} // constructors are generally used to set initial values 
	//without using this constructor java provides default constructor
	
	public void setNoOfCopies(int noOfCopies) {
		if(noOfCopies>0) {
			this.noOfCopies=noOfCopies;
		}
	}
	
	public void increaseNoOfCopies(int increase) {
		setNoOfCopies(this.noOfCopies + increase);
	}
	
	public void decreaseNoOfCopies(int decrease) {
		setNoOfCopies(this.noOfCopies - decrease);
	}
}
