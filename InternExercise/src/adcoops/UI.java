package adcoops;
import java.util.*;
public class UI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bazaar b=new Bazaar();
		b.setPolicyMap(new TreeMap<>());
		System.out.println("Enter the no of Policy names you want to store");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Policy ID");
			int policyId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Policy Name");
			String policyName=sc.next();
			b.addPolicyDetails(policyId, policyName);
		}
		Map<Integer,String> m=b.getPolicyMap();
		for(Integer i:m.keySet()) {
			System.out.println(i+" "+m.get(i));
		}
		System.out.println("Enter the policy type to be searched");
		String search=sc.nextLine();
		List<Integer> li=new ArrayList<>(b.searchBasedOnPolicyType(search));
		for(Integer i:li) {
			System.out.println(i);
		}
	}

}
