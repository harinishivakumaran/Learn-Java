package intern;
import java.util.*;
import java.math.*;
public class Placement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int cse=sc.nextInt();
        
        System.out.println("Enter the no of students placed in ECE:");
        int ece=sc.nextInt();
        
        System.out.println("Enter the no of students placed in MECH:");
        int mech=sc.nextInt();
        test(cse);
        test(ece);
        test(mech);
        if(cse==0 && ece==0 && mech==0){
            System.out.println("None of the department has got the highest placement");
            System.exit(0);
        }
        
        int m=Math.max(ece, cse);
        m=Math.max(m, mech);
        System.out.println("Highest placement");
        /*if(m==cse) {
        	System.out.println("CSE");
        }
        if(m==ece) {
        	System.out.println("ECE");
        }
        if(m==mech) {
        	System.out.println("MECH");
        }*/
        if(m==cse && m==ece) {
        	System.out.println("CSE");
        	System.out.println("ECE");
        }else if(m==cse && m==mech) {
        	System.out.println("CSE");
        	System.out.println("MECH");
        }else if(m==ece && m==mech) {
        	System.out.println("ECE");
        	System.out.println("MECH");
        }else if(m==cse) {
        	System.out.println("CSE");
        }else if(m==ece) {
        	System.out.println("ECE");
        }else if(m==mech) {
        	System.out.println("MECH");
        }
	}
	private static void test(int n) {
		if(n<=0) {
			System.out.println("Input is Invalid");
			System.exit(0);
		}
	}

}
