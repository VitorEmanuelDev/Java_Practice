package roomClass;

/*3.1 Write a program to create a room class, the attributes of this class is
roomno, roomtype, roomarea and ACmachine. In this class the member
functions are setdata and displaydata.*/

public class Main {
	
	public static void main (String[] args) {
		
		Room test1 = new Room();
		test1.setData(963, "Cloud 9", 50.5, true);
		test1.displayData();
		
	}


}
