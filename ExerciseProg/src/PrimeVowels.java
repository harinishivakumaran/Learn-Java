import java.util.*;

public class PrimeVowels {
	
	public  static String alpha(int n) {
		String s = "";
			switch(n) {
				case 1:
					s="one";
					break;
				case 2:
					s="two";
					break;
				case 3:
					s="three";
					break;
				case 4:
					s="four";
					break;
				case 5:
					s="five";
					break;
				case 6:
					s="six";
					break;
				case 7:
					s="seven";
					break;
				case 8:
					s="eight";
					break;
				default:
					s="nine";
					break;		
			}
			return s;
	}
	
	public static StringBuilder vow(int n) {
		StringBuilder ss=new StringBuilder();
		int m=n,i=0;
		if(n<10) {
			ss.append(alpha(n));
		}
		else {
			while(n>0) {
				ss.append(alpha(n%10));
				n/=10;
			}
		}
		return ss;
	}
	
	public static StringBuilder vowcon(StringBuilder s) {
		StringBuilder c=new StringBuilder();
		String s1=s.toString();
		char[] ss=s1.toCharArray();
		int count=0;
		for(int i=0;i<ss.length;i++) {
			if(ss[i]=='a' || ss[i]=='e' || ss[i]=='i' || ss[i]=='o' || ss[i]=='u' || ss[i]=='A' || ss[i]=='E'|| ss[i]=='I' || ss[i]=='U' ||ss[i]=='O') {
				c.append(ss[i]);
				count++;
			}
		}
		c.append(count);
		return c;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1,c=0,i;
		while(c<n) {
			num+=1;
			for(i=2;i<=num;i++) {
				if(num%i==0) {
					break;
				}
			}
			if(i==num) {
				c+=1;
			}
		}
		System.out.println(num);
		StringBuilder s=vow(num);
		System.out.println(s);
		StringBuilder ss=vowcon(s);
		System.out.println(ss);

	}

}
