package advJavaConcepts;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class PlacementCount {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter all roll numbers separated by comma");
		String roll=sc.nextLine();
		System.out.println("Enter the department name acronym");
		String acr=sc.nextLine();
		Stream<String> s=getRollNumbers(roll);
		int c=getCount(getRollNumbers(roll),acr);
		if(c==0) {
			System.out.println("No students from "+acr);
		}else {
			System.out.println("Number of students in "+acr+" is "+c);
		}
	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		
		Stream<String> ss = Arrays.stream(rollNumbers.split(","));
		return ss;
	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		
		return (int) rollNumberStream.filter(r -> r.substring(0,2).equalsIgnoreCase(dept)).count();
		

	}

}
