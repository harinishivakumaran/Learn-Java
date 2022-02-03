package assignments;

import java.util.*;
public class ValidateUtility {

	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		String employeeName=sc.nextLine();
		String productName=sc.nextLine();
		Validate vEmployeeName=validateEmployeeName();
		Validate vProductName=validateProductName();
		if(vEmployeeName.validateName(employeeName)) {
			System.out.println("Employee name is valid");
		}else {
			System.out.println("Employee name is invalid");
		}
		if(vProductName.validateName(productName)) {
			System.out.println("Product name is valid");
		}else {
			System.out.println("Product name is invalid");
		}
    }
    
    public static Validate validateEmployeeName() 
    {
    	Validate ven = s -> {
    		if(s.length()<5 || s.length()>20) {
    			return false;
    		}
    		for(int i=0;i<s.length();i++) {
    			if(!(s.charAt(i)==' ' || Character.isAlphabetic(s.charAt(i)))) {
    				return false;
    			}
    		}
    		return true;
    	};
    	return ven;
    }
    
    public static Validate validateProductName() 
    {
    	Validate vpn = s -> {
    		if(s.length()!=6) {
    			return false;
    		}
    		if(!Character.isAlphabetic(s.charAt(0))){
    			return false;
    		}
    		for(int i=1;i<6;i++) {
    				if(!Character.isDigit(s.charAt(i))){
    					return false;
    			}
    		}
    		return true;
    	};
    	
		return vpn;
    	
    	
    }
}
