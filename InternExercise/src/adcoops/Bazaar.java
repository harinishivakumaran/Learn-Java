package adcoops;

import java.util.*;

public class Bazaar {
	private Map<Integer,String> policyMap;
	
	public Map<Integer, String> getPolicyMap() {
		return policyMap;
	}
	public void setPolicyMap(Map<Integer, String> policyMap) {
		this.policyMap = policyMap;
	}
	//This method should add the policyID as key and policyName as value into the policyMap
	public void addPolicyDetails(int policyId,String policyName)
	{	
		policyMap.put(policyId,policyName);
	}
	public List<Integer> searchBasedOnPolicyType(String policyType){
		List<Integer> l=new ArrayList<>();
		for(Integer p:policyMap.keySet()) {
			String s=policyMap.get(p);
			if(s.contains(policyType)) {
				l.add(p);
			}
		}
		
		return l;
	
	}
}
