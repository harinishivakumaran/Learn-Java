package rainfall;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		RainfallReport rr=new RainfallReport();
		List<AnnualRainfall> ar=rr.generateRainfallReport("AllCityMonthlyRainfall.txt");
		List<AnnualRainfall> mrc=rr.findMaximumRainfallCities();
		
		System.out.println("All Cities");
		for(AnnualRainfall a: ar) {
			System.out.printf("id: %d, name: %s, rain: %f",a.getCityPincode(),a.getCityName(),a.getAverageAnnualRainfall());
		}
		
		System.out.println("Cities with maximum rainfall");
		for(AnnualRainfall a:mrc) {
			System.out.printf("id: %d, name: %s, rain: %f",a.getCityPincode(),a.getCityName(),a.getAverageAnnualRainfall());
		}
	}

}
