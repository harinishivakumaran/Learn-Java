package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map <String,Double> employeeMap=new HashMap<String,Double>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		employeeMap.put(employeeName,salary);
	}
	
	public static EmployeeAudit findEmployee()
	{
		ArrayList<String> name=new ArrayList<>();
		EmployeeAudit emAudit = s -> {
			for (String i : employeeMap.keySet()) {
				  if(employeeMap.get(i)<=s) {
					  name.add(i);
					  
				  }
				}
			return name;
		};
		return emAudit;
		
	}
	
	public static void main(String[] args)
	{
		
		Main m=new Main();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Add Employee Details\n2.Find Employee Details\n3.Exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Enter the Employee name");
				String empName=sc.next();
				sc.nextLine();
				System.out.println("Enter the Employee Salary");
				double empSalary=sc.nextDouble();
				m.addEmployeeDetails(empName,empSalary);
			}else if(choice==2) {
				System.out.println("Enter the salary to be searched");
				double audSalary=sc.nextDouble();
				EmployeeAudit empAudit=findEmployee();
				ArrayList<String> arr=empAudit.fetchEmployeeDetails(audSalary);
				if(arr!=null) {
					System.out.println("Employee List");
					for(String i:arr) {
						System.out.println(i);
					}
				}else {
					System.out.println("No Employee Found");
				}
			
			}else if(choice==3) {
				System.out.println("Let’s complete the session");
				break;
			}
		}
		
	}

}
