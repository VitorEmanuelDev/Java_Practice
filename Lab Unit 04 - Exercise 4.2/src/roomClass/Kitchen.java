package roomClass;

import roomClass.Room;

public class Kitchen {
	
	Room kitchen;
	
	public void createKitchen() {
		
		kitchen = new Room();
		kitchen.setData(23, "Gummy Bear Cuisine", 15, false);
		
	}
	
	public void displayKitchen() {
		
		kitchen.displayData();
		
	}


}
