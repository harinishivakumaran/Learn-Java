package intern;
import java.util.*;

public class Authority {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Inmate's name:");
		String s1=sc.nextLine();
		System.out.println("Inmate's father's name:");
		String s2=sc.nextLine();
		if(!check(s1) || !check(s2)) {
			System.out.println("Input Invalid");
			System.exit(0);
		}/*
		String [] ss1=s1.split(":", 2);
		String [] ss2=s2.split(":", 2);		
		int n1=ss1.length-1;
		int n2=ss2.length-1;
		String f=ss1[n1].toUpperCase();
		String l=ss2[n2].toUpperCase();
		String ss=f.concat(" ");
		String sss=ss.concat(l);
		//System.out.println(sss.toUpperCase());
		System.out.println(f+" "+l);*/
		String f=s1.toUpperCase();
		String l=s2.toUpperCase();
		System.out.println(f+" "+l);
	}
	
	private static boolean check(String s) {
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
	         if(s.charAt(i)==' ' || (Character.isAlphabetic(ch)) ){
	            continue;
	         }else{
	             return false;
	         }
	    }
		return true;
	}

}
