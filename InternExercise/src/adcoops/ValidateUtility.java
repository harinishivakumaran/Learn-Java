package adcoops;

import java.util.*;
public class ValidateUtility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ename=sc.next();
		sc.nextLine();
		String pname=sc.next();
		
		Validate v=validateEmployeeName();
		if(v.validateName(ename)) {
			System.out.println("Employee name is valid");
		}else {
			System.out.println("Employee name is invalid");
		}
		Validate v1=validateProductName();
		if(v1.validateName(pname)) {
			System.out.println("Product name is valid");
		}else {
			System.out.println("Product name is invalid");
		}
		
	}
	
	public static Validate validateEmployeeName() {
		Validate v = s -> {
			if(s.length()<5 || s.length()>20) {
				return false;
			}
			for(int i=0;i<s.length();i++) {
				if(!(Character.isAlphabetic(s.charAt(i)) && s.charAt(i)==' ')){
					return false;
				}
			}
			return true;
		};
		return v;
	}
	public static Validate validateProductName() {
		Validate v = s -> {
			if(s.length()!=6) {
				return false;
			}
			if(!Character.isAlphabetic(s.charAt(0))){
				return false;
			}
			for(int i=1;i<6;i++) {
				if(!Character.isDigit(s.charAt(i))) {
					return false;
				}
			}
			return false;
		};
		return v;
	}
}
