import java.util.*;
public class DoWhileRunner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=-1;
		do {
			if(n!=-1) { //edge cases.
			System.out.println("Cube is "+(n*n*n));
			}
			System.out.println("Enter a number: ");
			n=sc.nextInt();
		}while(n>=0);
		System.out.println("Thank you!");
		sc.close();
	}

}
