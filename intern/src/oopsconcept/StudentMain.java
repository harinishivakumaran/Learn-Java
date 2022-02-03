package oopsconcept;

import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student's Id:");
		int sid=sc.nextInt();
		System.out.println("Enter Student's Name:");
		String sname=sc.next();
		System.out.println("Enter Student's address:");
		String saddress=sc.next();
		String scollege;
		boolean flag=true, cflag=true;
		Student s;
		while(flag) {
			System.out.println("Whether the student is from NIT(Yes/No):");
			String nit=sc.next();
			if(  nit.equals("YES") || nit.equals("yes")) {
				flag=false;
				
			}else if( nit.equals("NO") || nit.equals("no")) {
				cflag=false;
				flag=false;
			}else{
				System.out.println("Wrong Input");
			}
			
		}
		if(cflag) {
			s=new Student(sid,sname,saddress);
		}else {
			System.out.println("Enter the college name:");
			scollege=sc.next();
			s=new Student(sid,sname,saddress,scollege);
		}
		
		
		System.out.println("Student id:"+s.getStudentId());
		System.out.println("Student name:"+s.getStudentName());
		System.out.println("Address:"+s.getStudentAddress());
		System.out.println("College name:"+s.getCollegeName());
	}
}
