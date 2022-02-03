package rainfallreport;

@SuppressWarnings("serial")
public class InvalidCityPincodeException extends Exception{
	public InvalidCityPincodeException(String message) {
		super(message);
	}
}
