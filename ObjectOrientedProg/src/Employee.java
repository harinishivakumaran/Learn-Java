import java.math.BigDecimal;
public class Employee extends Person{
	private String title;
	private String employeeName;
	private char employeeGrade;
	private BigDecimal salary;
	
	/*public Employee(String employeeName) {
	super(); //default calling
	this.employeeName = employeeName;
	}*/
	public Employee(String name,String title) {
		super(name);
		//super(); //an implicit call to Person super class
		this.title=title;
		System.out.println("Employee");
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return super.toString()+"#"+title+"#"+employeeName+"#"+employeeGrade;
	}//super.toString access the return values of the super class i.e., Person.
	//the toString() method is already present in Person class here it is override
	//then the return values of Person class cannot be obtained.
	//to obtain the return values of the superclass super.toString() is used.
}
