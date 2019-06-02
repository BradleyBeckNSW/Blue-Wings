import java.util.Scanner;

public class Address {
	String streetName;
	String suburbName;
	String postCode;
	
	public Address(String street, String suburb, String postcode) {
		streetName = street;
		suburbName = suburb;
		postCode = postcode;
}
	
	public Address() {
		streetName = "";
		suburbName = "";
		postCode = "0000";
}
	
	public void setAddress() {
		Scanner key = new Scanner(System.in);
		System.out.println("Input street name & number: ");
		streetName = key.nextLine();
		System.out.println("Input suburb: ");
		suburbName = key.nextLine();
		System.out.println("Input postcode: ");
		postCode = key.nextLine();
	}
	
	public void showAddress() {
		System.out.println("Address is: " + streetName + " in " + suburbName +
				" with postcode: " + postCode);
		
	}
	
}
	

