package rainfallreport;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException{
		List<AnnualRainfall> ar=new ArrayList<>();
		RainfallReport rr=new RainfallReport();
		ar=rr.generateRainfallReport("AllCityMonthlyRainfall.txt");
		DBHandler d=new DBHandler();
		Connection c=d.establishConnection();
		Statement s=c.createStatement();
		for(int i=0;i<ar.size();i++) {
			String sql="INSERT INTO ANNUALRAINFALL VALUES("+ar.get(i).getCityPincode()+
					","+""+ar.get(i).getCityName()+""+","+
					ar.get(i).getAverageAnnualRainfall()+")"+
					"ON DUPLICATE KEY UPDATE CITY_NAME="+""+ar.get(i).getCityName()+
					""+","+"AVERAGE_ANNUAL_RAINFALL = "+ 
					ar.get(i).getAverageAnnualRainfall()+";";
			s.executeUpdate(sql);
		}
		List<AnnualRainfall> mrc=new ArrayList<>();
		mrc=rr.findMaximumRainfallCities();
		for(int i=0;i<mrc.size();i++) {
			System.out.println(mrc.get(i).getCityName());
		}
	}

}
