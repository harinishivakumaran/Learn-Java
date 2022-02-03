package java.collections;

import java.util.*;
public class UniqueWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Set<String> set=new TreeSet<>();
		String[] str=s.split(" ");
		int n=str.length, index=1;
		System.out.println("Number of words "+n);
		for(int i=0;i<n;i++) {
			int len=str[i].length()-1;
			char j=str[i].charAt(len);
			if(j==',' || j==':' || j=='.' || j=='?' || j=='!' ) {
				str[i]=str[i].substring(0,len).toLowerCase();	
			}
			set.add(str[i]);
		}/*
		for(String ss:str) {
			String r=ss.toLowerCase();
			set.add(r);
		}*/
		System.out.println("Number of unique words "+set.size());
		for(String z:set) {
			System.out.println(index+"."+z);
			index++;
		}
		sc.close();
	}

}
