package exceptHandle;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) //this scanner statement will call the sc.close at the end of execution
		//Scanner has a AutoClosable class which can be called by using this try block (by TryWithResources)
		{
		int[] a= {12,3,4,23}; 
		int b=a[9]; 
		}
		//can have catch and finally block also 
	}

}
