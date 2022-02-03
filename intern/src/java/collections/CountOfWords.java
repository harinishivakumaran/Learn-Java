package java.collections;

import java.util.*;     
@SuppressWarnings("unchecked")//Do not delete this line
public class CountOfWords{
	
	private static int count(String[] s, String r) {
		int n=s.length;
		int c=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(r)) {
				c++;
			}
		}
		
		return c;
	}
	
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Article");
        String s=sc.nextLine().toLowerCase();
        String[] str=s.split("[ ,.;:?!]");
        Map<String, Integer> tm=new TreeMap<>();
        int n=0;
        for(int i=0;i<str.length;i++) {
			if(!str[i].isEmpty()) {
				n++;
				int c=count(str,str[i]);
				tm.put(str[i], c);
			}
		}
        System.out.printf("Number of words %d\n",n);
        Set<String> set=tm.keySet();
        
        Collection<Integer> list=tm.values();
        for(String ss:set) {
        	System.out.println(ss+": "+tm.get(ss));
        }
        sc.close();
    }     
}