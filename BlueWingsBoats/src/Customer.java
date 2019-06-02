import java.util.Scanner;

public class Customer {
	String name;
	int phone;
	String email;
	Address residence;
	

	
	public void addCustomer(String tempName, int tempPhone, String tempEmail, Address tempResidence) {
		name = tempName;
		phone = tempPhone;
		email = tempEmail;
		residence = tempResidence;
	}
	
	public void showCustomer() {
		System.out.println("Customer name is: " + name + " with phone number: " + phone +
				" and resides at: " + residence);
		
	}

}
