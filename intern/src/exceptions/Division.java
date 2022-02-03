package exceptions;

import java.util.*;
public class Division {
	
	public String divideTwoNumbers(int number1,int number2) {
		String r="";
		try {
			int a=number1/number2;
			r = "The answer is "+String.valueOf(a)+".";
		}catch(ArithmeticException e){
			r = "Division by zero is not possible.";
		}finally{
			r+=" Thanks for using the application.";
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		Division d=new Division();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		String s= d.divideTwoNumbers(n1,n2);
		System.out.println(s);
	}

}
