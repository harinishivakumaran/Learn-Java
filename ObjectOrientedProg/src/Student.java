//inheritance
public class Student extends Person{ //Student -> subclass
	//student is person.
	//relation between two classes.
	//The Student class inherits all the methods (behaviors),states (fields), etc.
	private String collegeName;
	private int year;
	
	public Student(String name,String collegeName) {
		super(name); //call super class constructor (Person)
		this.collegeName=collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
