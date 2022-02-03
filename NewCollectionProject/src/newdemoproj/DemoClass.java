package newdemoproj;
import java.util.*;
public class DemoClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer[] arr1= {34,54,22,45};
		
		List<Integer> list = Arrays.asList(arr1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		/*Integer[] arr=new Integer[6];
		for(int i=1;i<=5;i++) {
			arr[i]=sc.nextInt();
		}*/
		
		Map<Integer,String> map=new HashMap<>();
		for(Integer i:list) {
			map.put(i, sc.next());
		}
		for(Integer i:map.keySet()) {
			System.out.println(i+" "+map.get(i));
		}
		sc.close();
	}

}
