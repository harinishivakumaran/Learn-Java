package DC;
import java.util.*;
public class StringConcat {
	//DT 06-08-2020
	//test input
	//s1 everyone
	//s2 every
	//x 3
	//output -> eve ver ery
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next(),s2=sc.next();
		int x=sc.nextInt();
		List<String> l=new ArrayList<>();
		for(int i=0;i<s1.length();i++){
		    for(int j=i+1;j<=s1.length();j++){
		    	String str=s1.substring(i,j);
		    	if(s2.contains(str)&&str.length()==x)
		    		l.add(str);
		    }
		}Collections.sort(l);
		if(l.size()==0) System.out.print(-1);
		else l.forEach(n->System.out.print(n+" "));
		sc.close();
	}
}