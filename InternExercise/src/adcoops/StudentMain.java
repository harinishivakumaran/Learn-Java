package adcoops;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s=null;
		System.out.println("Enter Student's Id:");
		int studentId=sc.nextInt();
		System.out.println("Enter Student's Name:");
		String studentName=sc.next();
		System.out.println("Enter Student's address:");
		String studentAddress=sc.next();
		while(true) {
			System.out.println("Whether the student is from NIT(Yes/No):");
			String yn=sc.next();
			if(yn.equalsIgnoreCase("yes")) {
				s=new Student(studentId,studentName,studentAddress);
				break;
			}else if(yn.equalsIgnoreCase("no")) {
				System.out.println("Enter the college name:");
				String collegeName=sc.next();
				s=new Student(studentId,studentName,studentAddress,collegeName);
				break;
			}else {
				System.out.println("Wrong Input");
			}
			
		}
		System.out.println("Student id:"+s.getStudentId()+"\nStudent name:"+s.getStudentName()+"\nAddress:"+s.getStudentAddress()+"\nCollege name:"+s.getCollegeName());
		
	}

}
