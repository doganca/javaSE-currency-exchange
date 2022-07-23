package paraBozma;

public class Customer extends Human {

	private int customerId;
	
	public Customer(int id, String name, String surname) {
		super(name, surname);
		customerId = id;
	}
	
	public int getCustomerId() {
		return customerId;
	}

}
