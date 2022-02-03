package DC;
import java.util.*;
//DT 08.08.2020
public class leftShiftSmallest {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); // input -> 23116
		int min = Integer.MAX_VALUE;
		for(int i = 0;i < s.length(); i++) {
		    String k = s.substring(1)+s.charAt(0);
		    int num = Integer.parseInt(k);
		    min = Math.min(min,num);
		    s = k;
		}
		System.out.print(min); //output -> 11623
		sc.close();
	}
}