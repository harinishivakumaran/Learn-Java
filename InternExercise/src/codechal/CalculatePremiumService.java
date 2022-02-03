package codechal;

import java.util.*;

public class CalculatePremiumService {
	private static String b1;
	private static String b2;
	private static String name;
	static Scanner sc = new Scanner(System.in);
	static PropertyDetails[] propertyDetails = null;

	public static boolean checkOwnerDetails(String name, long mobile) {
		String s = String.valueOf(mobile);
		boolean b = false;
		if (name.length() >= 2) {
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) < 65 || (name.charAt(i) > 90 && name.charAt(i) < 97) || name.charAt(i) > 122) {
					b = false;
				} else if (s.length() == 10 && (s.charAt(0) >= 6) || (s.charAt(0) <= 9)) {
					b = true;
				}
			}
		} else {
			b = false;
		}
		return b;
	}

	public static double getPremiumAmount() {
		int a = PropertyDetails.getBuiltYear();
		int MIN_PREMIUM_AMOUNT = 5000;
		double PREMIUM_AMOUNT = 0;
		int year = 2020 - a;
		if (year <= 5) {
			PREMIUM_AMOUNT = MIN_PREMIUM_AMOUNT + 0.1 * sumInsured();
		} else if (year >= 6 && year <= 15) {
			PREMIUM_AMOUNT = MIN_PREMIUM_AMOUNT + 0.2 * sumInsured();
		} else if (year > 15) {
			PREMIUM_AMOUNT = MIN_PREMIUM_AMOUNT + 3.5 * sumInsured();
		}
		if (CalculatePremiumService.b1.equalsIgnoreCase("yes")) {
			PREMIUM_AMOUNT = PREMIUM_AMOUNT + 0.01 * PREMIUM_AMOUNT;
		}
		if (CalculatePremiumService.b2.equalsIgnoreCase("yes")) {
			PREMIUM_AMOUNT = PREMIUM_AMOUNT + 0.01 * PREMIUM_AMOUNT;
		}
		return PREMIUM_AMOUNT;
	}

	public static int sumInsured() {
		int a = PropertyDetails.getBuiltUpArea();
		int b = PropertyDetails.getReconstructionCost();
		int c = PropertyDetails.getHouseholdValuation();
		int sumInsured = a * b + c;
		return sumInsured;
	}

	public static void addPropertyDetails(PropertyDetails[] PropertyDetails) {
		int householdValuation = 0;
		String burglaryCoverReqd = "";
		String politicalUnrestCoverReqd = "";
		for (int i = 0; i < PropertyDetails.length; i++) {
			System.out.println("Enter the Built-Up Area(in sq.ft.)between 400 and 15,000");
			int builtupArea = sc.nextInt();
			
			System.out.println("Enter the year the house was built");
			int builtYear = sc.nextInt();
			
			System.out.println("Enter the Re-construction cost(per sq.ft.)between 1,000 and 10,000");
			int reconstructionCost = sc.nextInt();
			
			System.out.println("Do you want to include validation HouseHold Articles? Please Provide yes/no");
			String b = sc.next();
			
			if (b.equalsIgnoreCase("yes")) {
				System.out.println("Enter the HouseHold valuation between Rs.1,00,000 and Rs.15,00,000");
				householdValuation = sc.nextInt();
			}
			System.out.println("Do you want to include Burglary cover? Please provide yes/no");
			b1 = sc.next();
			
			System.out.println("Do you want to include Political unrest cover? Please provide yes/no");
			b2 = sc.next();
			
			PropertyDetails[i] = new PropertyDetails(builtupArea, builtYear, reconstructionCost, householdValuation,
					burglaryCoverReqd, politicalUnrestCoverReqd);
			int sumInsured = sumInsured();
			double getPremiumAmount = getPremiumAmount();
			System.out.println("sumInsured  :  Rs." + sumInsured);
			System.out.println("insurance medium for the property of " + name + " : Rs" + getPremiumAmount);
		}
	}

	public static void main(String[] args) throws Exception {

		System.out.println("Enter the name ");
		name = sc.nextLine();
		System.out.println("Enter the mobile ");
		long mobile = sc.nextLong();
		boolean b = checkOwnerDetails(name, mobile);
		if (b) {
			propertyDetails = new PropertyDetails[1];
			addPropertyDetails(propertyDetails);
		}
	}

}
