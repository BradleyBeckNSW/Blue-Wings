import java.util.Scanner;
import java.sql.*;
public class Main {

	public static void main(String[] args) {
		//Boat Penguin = new Boat(2400, true);
		//Penguin.getDetails();
		Scanner keyboard = new Scanner(System.in);
		boolean repeat = true;
		
		
		while (repeat) {
			System.out.println("--------------------------------");
			System.out.println("What would you like to do?");
			System.out.println("1: Create a customer");				//addCustomer()
			System.out.println("2: Create a booking");				//addLease()
			System.out.println("3: Calculate booking payment");		//determinePayment()
			System.out.println("4: Check boat availabilities");		//searchBoats()
			System.out.println("5: Quit");							//quit the program
			
			int task = keyboard.nextInt();
			switch (task) {
			case 1: //Create a customer - GUI improvable
				Customer B = new Customer();
				
				System.out.println("Input first and last name of customer: ");
				keyboard.nextLine();
				String setName = keyboard.nextLine();				
				
				System.out.println("Input phone number of customer: ");
				String setPhone = keyboard.nextLine();			
				
				System.out.println("Input email of customer: ");
				String setEmail = keyboard.nextLine();				
				
				System.out.println("Input address of customer: ");
				Address setResidence = new Address();
				setResidence.setAddress();
				
				
				B.addCustomer(setName, setPhone, setEmail, setResidence);
				setResidence.showAddress();
				
				B.showCustomer();

				break;
			case 2: //Create a booking
				
				break;
			case 3: //Calculate booking payment
				
				break;
			case 4:
				
				break;
			case 5: 
				repeat = false;
				System.out.println("Goodbye, my friend!");
				System.out.println("");
				break;
			}
			
		}
	}

}
