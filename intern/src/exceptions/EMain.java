package exceptions;
import java.util.*;
public class EMain {
	public static Candidate getCandidateDetails() throws InvalidSalaryException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the candidate Details");
		System.out.println("Name");
		String name=sc.next();
		System.out.println("Gender");
		String gender=sc.next();
		System.out.println("Expected Salary");
		double salary=sc.nextDouble();
		if(salary<10000) {
			throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000");
		}else {
			Candidate c=new Candidate();
			c.setName(name);
			c.setGender(gender);
			c.setExpectedSalary(salary);
			return c;
		}
	}
	public static void main(String[] args) throws InvalidSalaryException {
		try {
			Candidate c=getCandidateDetails();
			System.out.println("Registration Successful");
		}catch(InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
	}

}
