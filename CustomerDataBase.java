package paraBozma;

public class CustomerDataBase {
	
	private static Customer[] customers = {
			new Customer(1, "Dogancan", "Yilmaz"),
			new Customer(2, "Volkan", "İstek"),
			new Customer(3, "ahmet", "Ahmedov"),
			new Customer(4, "Dogancan", "Yilmaz"),
			
	};

	public static Customer findCustomer(int musteriNumarasi) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getCustomerId() == musteriNumarasi ) {
				return customers[i];
			}
		}
		return null;
	}


}
