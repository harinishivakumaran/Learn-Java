package adcoops;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter registration number");
		int regno=sc.nextInt();
		System.out.println("Enter student name");
		String sname=sc.next();
		sc.nextLine();
		System.out.println("Enter no of semesters");
		int nosem=sc.nextInt();
		System.out.println("Enter basic fee");
		int basicfee=sc.nextInt();
		System.out.println("Course type");
		String ctype=sc.next();
		
		TuitionFee t = generateFeeReceipt();
		int fee=t.calculateTuitionFees(ctype, basicfee, nosem);
		System.out.println("Fees Receipt\nRegistration number: "+regno);
		System.out.println("Student name: "+sname);
		System.out.println("Tuition fee for regular student: "+fee);
	}
	
	public static TuitionFee generateFeeReceipt() {
		TuitionFee tf = (String courseType,int basicFee,int noOfSemesters) -> {
			if(courseType.equalsIgnoreCase("regular")) {
				return basicFee*noOfSemesters;
			}
			if(courseType.equalsIgnoreCase("SelfFinance")) {
				return (basicFee*noOfSemesters)+50000;
			}
			return 0;
		};
		return tf;
	}
	
}
