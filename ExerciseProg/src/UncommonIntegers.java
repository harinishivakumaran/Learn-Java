import java.util.*;
public class UncommonIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt(),n=sc.nextInt();
		Integer[] a=new Integer[m];
		Integer[] b=new Integer[n];
		for(Integer i=0;i<m;i++)
			a[i]=sc.nextInt();
		for(Integer i=0;i<n;i++)
			b[i]=sc.nextInt();
		List<Integer> aa=new ArrayList<Integer>();
		List<Integer> bb=new ArrayList<Integer>();
		for(Integer i=0;i<m;i++)
			aa.add(a[i]);
		for(Integer i=0;i<n;i++)
			bb.add(b[i]);
		Set<Integer> a1=new TreeSet<Integer>(aa);
		for(Integer i=0;i<n;i++)
			a1.add(b[i]);
		System.out.print(a1+" ");
		sc.close();	
	}

}
