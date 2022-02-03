package exceptHandle;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			int[] a= {12,3,4,23}; 
			int b=a[9]; //when exception thrown directly goes to catch block
			//return; even if this return is present the finally block compulsorily be executed
			System.out.println("No Exception"); //if there's any exception this statement will not be executed.
		} catch(Exception e) {
			//e.printStackTrace(); //prints the thrown exception int the output
			System.out.println("ExceptionHandled");
		} finally {
			//whether try or catch is executed, finally is always executed.
			System.out.println("Before sc close");
			if(sc!=null)
				sc.close();			
		}
		System.out.println("Finish");
	}

}
