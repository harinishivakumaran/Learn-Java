
public class Address {
	//state
	private String line1;
	private String city;
	private String zipcode;
	
	//creation
	public Address(String line1, String city, String zipcode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public String toString() {
		return line1+" "+city+" "+zipcode;
	}
}
