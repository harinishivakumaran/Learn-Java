package rainfallreport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RainfallReport {
	public boolean validate(String cityPincode) throws InvalidCityPincodeException {
		if(cityPincode.length()==5) { 
			return true;
		} else {
			throw new InvalidCityPincodeException("Invalid CityPincode Exception");
		}
	}

	public List<AnnualRainfall> generateRainfallReport(String f) throws IOException {
		List<AnnualRainfall> ar = new ArrayList<>();

		BufferedReader bf = new BufferedReader(new FileReader(f));
		String t;
		while ((t = bf.readLine()) != null) {
			String[] a = t.split(",");
			String pincode = a[0];
			try {
				if (validate(pincode)) {
					double[] mr = new double[12];
					for (int i = 2; i <= 13; i++) {
						mr[i - 2] = Double.parseDouble(a[i]);
					}
					AnnualRainfall arf = new AnnualRainfall();
					arf.calculateAverageAnnualRainfall(mr);
					arf.setCityName(a[1]);
					arf.setCityPincode(Integer.parseInt(pincode));
					ar.add(arf);
				}
			} catch (InvalidCityPincodeException e) {
				System.out.println(e.getMessage());
			}
		}
		bf.close();
		return ar;
	}

	public List<AnnualRainfall> findMaximumRainfallCities() throws IOException, SQLException, ClassNotFoundException {
		List<AnnualRainfall> mrc = new ArrayList<>();
		DBHandler d = new DBHandler();
		Connection c = d.establishConnection();
		Statement s = c.createStatement();
		String sql="SELECT * FROM ANNUALRAINFALL WHERE AVERAGE_ANNUAL_RAINFALL IN (SELECT MAX(AVERAGE_ANNUAL_RAINFALL) FROM ANNUALRAINFALL)";
		ResultSet rs = s.executeQuery(sql);
		while (rs.next()) {
			AnnualRainfall aaa = new AnnualRainfall();
			aaa.setCityPincode(Integer.parseInt(rs.getString(1)));
			aaa.setCityName(rs.getString(2));
			aaa.setAverageAnnualRainfall(Double.parseDouble(rs.getString(3)));
			mrc.add(aaa);
		}
		
		return mrc;
	}
}
