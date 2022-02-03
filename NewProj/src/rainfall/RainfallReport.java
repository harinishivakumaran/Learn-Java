package rainfall;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class RainfallReport {
	public boolean validate(String cityPincode) throws InvalidCityPincodeException{
		Pattern p=Pattern.compile("^\\d{5}$");
		Matcher m=p.matcher(cityPincode);
		if(m.matches()) { //if(cityPincode.length()==5)
			return true;
		}else {
			throw new InvalidCityPincodeException("Invalid city Pincode");
		}
	}
	public List<AnnualRainfall> generateRainfallReport(String f){
		List<AnnualRainfall> ar=new ArrayList<>();
		try {
			BufferedReader bf=new BufferedReader(new FileReader(f));
			Scanner sc=new Scanner(bf);
			while(sc.hasNext()) {
				String[] r=sc.nextLine().split(",");
				String cp=r[0];
				boolean flag=false;
				try {
					flag=validate(cp);
					if(flag) {
						int cc=Integer.parseInt(cp);
						String cn=r[1];
						double[] mr=new double[12];
						for(int i=0;i<12;i++) {
							mr[i] = Double.parseDouble(r[i+2]);
						}
						AnnualRainfall arf=new AnnualRainfall();
						arf.setCityPincode(cc);
						arf.setCityName(cn);
						arf.calculateAverageAnnualRainfall(mr);
						ar.add(arf);
					}
				}catch(InvalidCityPincodeException e) {
					System.out.println(e.getMessage());
				}
			}
			sc.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return ar;
	}
	public List<AnnualRainfall> findMaximumRainfallCities(){
		List<AnnualRainfall> mrc=new ArrayList<>();
		try {
			Connection c=new DBHandler().establishConnection();
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select *\n"+
					"from AnnualRainfall\n"+
					"where average_annual_rainfall = (\n"+
					" select max(average_annual_rainfall)\n"+
					" from AnnualRainfall\n"+
					");");
			while(rs.next()) {
				int cp=rs.getInt(1);
				String cn=rs.getString(2);
				double aar=rs.getDouble(3);
				AnnualRainfall aaa=new AnnualRainfall();
				aaa.setCityPincode(cp);
				aaa.setCityName(cn);
				aaa.setAverageAnnualRainfall(aar);
				mrc.add(aaa);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return mrc;
	}
}
