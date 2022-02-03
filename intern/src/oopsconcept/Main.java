package oopsconcept;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Employee> employeeList=new ArrayList<>();
		Management m=null;
		System.out.println("Enter the number of employees");
		int n=sc.nextInt();
		System.out.println("Enter the employee details");
		String[] arr=new String[n+1];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
			String[] s=arr[i].split(":",3);
			double sal=Float.parseFloat(s[2]);
			Employee e=new Employee(s[0],s[1],sal);
			//System.out.print(s[0]+" "+s[1]+" "+sal+"\n");
			employeeList.add(e);
		}
		System.out.println("Enter the number of times salary limit to be searched");
		int times=sc.nextInt();
		int[] salarylimit=new int[times+1];
		for(int i=0;i<times;i++){
			System.out.println("Enter the salary limit to be searched");
			salarylimit[i]=sc.nextInt();
		}
		for(int i=0;i<times;i++) {
			m= new Management(salarylimit[i],employeeList);
			m.run();
		}
		sc.close();
	}

}
