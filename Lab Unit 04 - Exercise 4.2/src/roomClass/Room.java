package roomClass;

public class Room {
	
	int roomNumber;
	String roomType;
	double roomArea;
	boolean ACmachine;
	
	public void setData(int roomNum, String roomTy, double roomAr, boolean ACm) {
		
		roomNumber = roomNum;
		roomType = roomTy;
		roomArea = roomAr;
		ACmachine = ACm;
		
	}
	

	public void displayData() {
		
		System.out.println("The room number is " + roomNumber);
		System.out.println("The room type is " + roomType);
		System.out.println("The room area is " + Math.round(roomArea) + "m²");
		System.out.println("The room has an AC:" + ACmachine);
		System.out.print("\n");
		
	}



}
