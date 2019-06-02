
public class Boat  {
	enum Size {Small, Medium, Large};
	
	private boolean available;
	private int boatID;
	private Size boatSize;
	
	public Boat(int initialID, boolean initialAvail) {
		boatID = initialID;
		available = initialAvail;
		boatSize = this.setSize();
	}
	
	public void getDetails() {
		System.out.println("Boat ID: " + boatID);
		System.out.println("Boat availability: " + available);
		System.out.println("Boat Size: " + boatSize);
	}

	public void setName(int newID) {
		this.boatID = newID;
	}
	
	//Book the boat out
	public void setBooking() {
		this.available = false;
	}
	//Return the boat
	public void setReturn() {
		this.available = true;
	}
	
	private Size setSize() {

		if (boatID >= 1000 && boatID < 2000)
			return Size.Small;
		else if (boatID >= 2000 && boatID < 3000)
			return Size.Medium;
		else 
			return Size.Large;

	}
	

	

}
