
public class Customer {
	//state
	private String name;
	private Address homeAddress; //object composition -> an object inside an object
	private Address workAddress; //the class Customer has two object composition.
	
	//creation
	public Customer(String name,Address homeAddress) {
		this.name=name;
		this.homeAddress=homeAddress;
	}

	//operation
	public Address getWorkAddress() {
		return workAddress;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	public String toString() {
		return String.format("name-[%s] home address-[%s] work address-[%s]",name,homeAddress,workAddress);
	}
}
