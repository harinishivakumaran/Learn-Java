package rainfall;

public class AnnualRainfall {
	private int cityPincode;
	private String cityName;
	private double averageAnnualRainfall;
	public int getCityPincode() {
		return cityPincode;
	}
	public void setCityPincode(int cityPincode) {
		this.cityPincode = cityPincode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getAverageAnnualRainfall() {
		return averageAnnualRainfall;
	}
	public void setAverageAnnualRainfall(double averageAnnualRainfall) {
		this.averageAnnualRainfall = averageAnnualRainfall;
	}
	public void calculateAverageAnnualRainfall(double[] monthlyRainfalls) {
		double t=0;
		for(double i:monthlyRainfalls) {
			t+=i;
		}
		t/=12.0;
		this.averageAnnualRainfall = t;
	}
}
