package roomClass;

/*4.2 Write a program for reuse class. For this program use the above ‘room
class’ program. */

public class Main {
	
	public static void main (String[] args) {
		
		Room test1 = new Room();
		test1.setData(963, "Cloud 9", 50.5, true);
		test1.displayData();
		
		Kitchen kitchen = new Kitchen();
		kitchen.createKitchen();
		kitchen.displayKitchen();
		
	}


}
