import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;
public class Main {
	private static addCustomer addCustomerFrame;
	public static void main(String[] args) {
		addCustomerFrame = new addCustomer();
		addCustomerFrame.setVisible(true);
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		boolean repeat = true;
		ArrayList<Customer> temporaryDatabase = new ArrayList<Customer>();

		
		
//		while (repeat) {
//			System.out.println("--------------------------------");
//			System.out.println("What would you like to do?");
//			System.out.println("1: Create a customer");				//addCustomer()
//			System.out.println("2: Create a booking");				//addLease()
//			System.out.println("3: Calculate booking payment");		//determinePayment()
//			System.out.println("4: Check boat availabilities");		//searchBoats()
//			System.out.println("5: Quit");							//quit the program
//			System.out.println("5: Check DB");
//			
//			int task = keyboard.nextInt();
//			switch (task) {
//			case 1: //Create a customer - GUI improvable
//				Customer tempCust = new Customer();
//				
//				System.out.println("Input first and last name of customer: ");
//				keyboard.nextLine();
//				String setName = keyboard.nextLine();				
//				
//				System.out.println("Input phone number of customer: ");
//				String setPhone = keyboard.nextLine();			
//				
//				System.out.println("Input email of customer: ");
//				String setEmail = keyboard.nextLine();				
//				
//				System.out.println("Input address of customer: ");
//				Address setResidence = new Address();
//				setResidence.setAddress();
//				
//				
//				tempCust.addCustomer(setName, setPhone, setEmail, setResidence);
//				
//				temporaryDatabase.add(tempCust);
//				//setResidence.showAddress();
//				tempCust.showCustomer();
//
//				break;
//			case 2: //Create a booking
//				
//				break;
//			case 3: //Calculate booking payment
//				
//				break;
//			case 4: //Check boat availabilities
//				
//				break;
//			case 5: //quit
//				repeat = false;
//				System.out.println("Goodbye, my friend!");
//				System.out.println("");
//				break;
//			case 6: //Check DB
//				System.out.println(temporaryDatabase);
//				System.out.println("input db number: ");
//				int dbPos = keyboard.nextInt();	
//				Customer display = temporaryDatabase.get(dbPos);
//				display.showCustomer();
//				break;
//			}
//			
//		}
		
	}

}
