import java.util.*;

public class Arr {

	public static void main(String[] args) {
		int marks[]= {76,73,90,62};
		int sum=0;
		for(int i:marks) { //enhanced for loop
			System.out.print(i+" ");
			sum += i;
		}
		System.out.println();		
		System.out.println(sum);
		System.out.println(marks.length);//here length used is a property of arrays.
		int a[]=new int[4];//initialization 
		double arr[]=new double[3];
		boolean b[]=new boolean[3];
		System.out.println(Arrays.toString(a));//to print the content use Arrays.toString();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
		Arrays.fill(a, 40);//assigns all values to 40
		System.out.println(Arrays.toString(a));
		int c[]= {40,40,40,40};
		System.out.println(Arrays.equals(a, c)); //compare two arrays.
		int ss[]= {34,22,65,11,87};
		System.out.println(Arrays.toString(ss));
		Arrays.sort(ss);//sorting
		System.out.println(Arrays.toString(ss));

	}

}
