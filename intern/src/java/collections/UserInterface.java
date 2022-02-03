package java.collections;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		System.out.println("Enter the no of Policy names you want to store");
		int n=sc.nextInt();
		Bazaar bazaar=new Bazaar();
		bazaar.setPolicyMap(new TreeMap<>());
		for (int i = 0; i < n; ++i) {
            System.out.println("Enter the Policy ID");
            int policyId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Policy Name");
            String policyName = sc.nextLine();

            bazaar.addPolicyDetails(policyId, policyName);
        }

        Map<Integer,String> m=bazaar.getPolicyMap();
        Set<Integer> s=m.keySet();
        for(Integer i:s){
            System.out.println(i+" "+m.get(i));
        }
        System.out.println("Enter the policy type to be searched");
        String pt=sc.next();
        List<Integer> li=new ArrayList<>(bazaar.searchBasedOnPolicyType(pt));
        for(Integer l:li) {
        	System.out.println(l);
        }
        sc.close();
	}
	
}
