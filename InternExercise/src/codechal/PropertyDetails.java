package codechal;

public class PropertyDetails {
	
	static int builtUpArea;
	static int builtYear;
	static int reconstructionCost;
	static int householdValuation;
	String burglaryCoverReqd;
	String politicalUnrestCoverReqd;
	int sumAssured;
	
	public static int getBuiltUpArea() {
		return builtUpArea;
	}
	public  void setBuiltUpArea(int builtUpArea) {
		this.builtUpArea = builtUpArea;
	}
	
	public static int getBuiltYear() {
		return builtYear;
	}
	public void setBuiltYear(int builtYear) {
		this.builtYear = builtYear;
	}
	
	public static int getReconstructionCost() {
		return reconstructionCost;
	}
	public void setReconstructionCost(int reconstructionCost) {
		this.reconstructionCost = reconstructionCost;
	}
	
	public static int getHouseholdValuation() {
		return householdValuation;
	}
	public void setHouseholdValuation(int householdValuation) {
		this.householdValuation = householdValuation;
	}
	
	public PropertyDetails(int builtUpArea, int builtYear, int reconstructionCost, 
			int householdValuation,String burglaryCoverReqd,String politicalUnrestCoverReqd)
	{
		this.builtUpArea = builtUpArea;
		this.builtYear = builtYear;
		this.reconstructionCost = reconstructionCost;
		this.householdValuation = householdValuation;
		this.burglaryCoverReqd = burglaryCoverReqd;
		this.politicalUnrestCoverReqd = politicalUnrestCoverReqd;
	}
}
