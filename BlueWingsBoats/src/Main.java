import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Boat Penguin = new Boat(2400, true);
		//Penguin.getDetails();
	
		Scanner keyboard = new Scanner(System.in);
		Customer B = new Customer();
		System.out.println("Input first and last name of customer: ");
		String setName = keyboard.next();
	
		//System.out.println("Input phone number of customer: ");
		//int setPhone = keyboard.nextInt();
		
		//System.out.println("Input email of customer: ");
		//String setEmail = keyboard.next();
		
		System.out.println("Input address of customer: ");
		Address setResidence = new Address();
		
		setResidence.setAddress();
		
		//B.addCustomer(setName, 5, setEmail, setResidence);
		setResidence.showAddress();
		//B.showCustomer();
	}

}
