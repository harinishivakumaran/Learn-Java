package intern;

import java.util.*;

public class AverageAge {
	
	private static double calculateAverage(int[] arr) {
		int n=arr.length-1;
		int s=0;
		for(int i=0;i<n;i++) {
			s+=arr[i];
		}
		double avg=s/(n*1.0);
		return avg;
	}
	
	public static void main(String[] args) {
		AverageAge aa=new AverageAge();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no.of employees:");
		int n=sc.nextInt();
		int s=0;
		double avg;
		if(n<2) {
			System.out.println("Please enter a valid employee count");
		}else {
			int[] arr=new int[n+1];
			System.out.println("Enter the age for "+n+" employees:");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				if(arr[i]<28 || arr[i]>40) {
					System.out.println("Invalid age encountered!");
					return;
				}
				s+=arr[i];
			}
			//avg=(s/(n*1.0));
			avg=calculateAverage(arr);
			System.out.printf("The average age is %.2f",avg);
			
		}
	}

}
