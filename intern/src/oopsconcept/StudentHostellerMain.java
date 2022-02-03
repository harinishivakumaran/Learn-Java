package oopsconcept;

import java.util.*;
public class StudentHostellerMain {

	public static Hosteller getHostellerDetails() {
		Scanner sc=new Scanner(System.in);
		Hosteller hos=new Hosteller();
		System.out.println("Enter the Details:\nStudent Id");
		int sid=sc.nextInt();
		hos.setStudentId(sid);
		System.out.println("Student Name");
		String sname=sc.next();
		hos.setName(sname);
		System.out.println("Department Id");
		int deptid=sc.nextInt();
		hos.setDepartmentId(deptid);
		System.out.println("Gender");
		String gender=sc.next();
		hos.setGender(gender);
		System.out.println("Phone Number");
		String phnno=sc.next();
		hos.setPhone(phnno);
		System.out.println("Hostel Name");
		String hostelname=sc.next();
		hos.setHostelName(hostelname);
		System.out.println("Room Number");
		int roomno=sc.nextInt();
		hos.setRoomNumber(roomno);
		System.out.println("Modify Room Number(Y/N)");
		char rmno=sc.next().charAt(0);
		if(rmno=='Y') {
			System.out.println("New Room Number");
			roomno=sc.nextInt();
			hos.setRoomNumber(roomno);
		}
		System.out.println("Modify Phone Number(Y/N)");
		char phn=sc.next().charAt(0);
		if(phn=='Y') {
			System.out.println("New Phone Number");
			phnno=sc.next();
			hos.setPhone(phnno);
		}
		
		return hos;
		
	}
	
	
	public static void main(String[] args) {
		Hosteller h=new Hosteller();
		h=getHostellerDetails();
		
		System.out.println("The Student Details\n"+h.getStudentId()+" "+
				h.getName()+" "+h.getDepartmentId()+" "+h.getGender()+" "+h.getPhone()+" "
				+h.getHostelName()+" "+h.getRoomNumber());
	}

}
