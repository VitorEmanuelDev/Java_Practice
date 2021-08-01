package boxes;

/*9.2 Create class box and box3d. box3d is extended class of box. The above
two classes going to pull fill following requirement
 Include constructor.
 set value of length, breadth, height
 Find out area and volume.
Note: Base class and sub classes have respective methods and instance
variables.*/

public class Main {
	
	public static void main(String [] args){
		
		 Box box1 = new Box();
		 Box3d box2 = new Box3d(30,30,30);
		 box1.setDimensions (25,30); 
		 System.out.println ("Box one area : " + box1.area());
		 System.out.println ("Box two volume: " + box2.volume());
	} 

}
