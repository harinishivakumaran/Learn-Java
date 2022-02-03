package DC;
import java.util.*;
//26-08-2020
public class WaterImage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		List<String> waterImage=new ArrayList<>();
		int num=1;
		for(int ctr1=1;ctr1<=N;ctr1++){
		    String image="*".repeat(N-ctr1);
		    for(int ctr2=num;ctr2>num-ctr1;ctr2--){
		        image+=ctr2+" ";
		    }
		    num+=ctr1+1;
		    System.out.println(image);
		    waterImage.add(image);
		}
		Collections.reverse(waterImage);
		for(String image:waterImage){
		    System.out.println(image);
		}
		sc.close();
	}

}
