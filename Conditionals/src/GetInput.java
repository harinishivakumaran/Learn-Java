import java.util.*;

public class GetInput {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println("The number you entered is "+n);
		int m=scanner.nextInt();
		System.out.println("The number you entered is "+m);
		int c=scanner.nextInt();
		System.out.println("The choice you entered is "+c);
		scanner.close();
		switchOperationMethod(n,m,c);//switch can be used only for data types like integer,char, short, int and byte or in string and enum.
	}

	private static void switchOperationMethod(int a,int b,int choice) {
		switch(choice) {
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			default:
				System.out.print("Default");
				break;
		}
	}
}