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
		streetName = key.next();
		System.out.println("Input suburb: ");
		suburbName = key.next();
		System.out.println("Input postcode: ");
		postCode = key.next();
	}
	
	public void showAddress() {
		System.out.println("Address is: " + streetName + " in " + suburbName +
				" with postcode: " + postCode);
		
	}
	
}
	

