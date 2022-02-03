import java.util.*;

public class SumOfSmallTwoDigits {
	
	public static int minTwo(int n){
		List<Integer> d=new ArrayList<Integer>();
		while(n>0) {
			d.add(n%10);
			n/=10;
		}
		Collections.sort(d);
		return (d.get(0)*10)+d.get(1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
		System.out.println(minTwo(a)+minTwo(b)+minTwo(c)+minTwo(d));
		sc.close();
	}

}
