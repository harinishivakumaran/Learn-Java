//object composition
public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress=new Address("line 1","Chennai","600081");
		Customer customer=new Customer("Harini",homeAddress);
		System.out.println(customer);
		Address workAddress=new Address("line 1 for work","Chennai","600081");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}

}
