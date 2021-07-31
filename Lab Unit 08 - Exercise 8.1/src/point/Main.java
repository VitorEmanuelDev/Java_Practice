package point;

/*8.1 Create class point with following instance variable and methods.
Instance variable: private int x,y
Constructors
: public Point(), Point(int x, int y)
Methods
: public void setX(int x), setY(int y), setXY(int x,
int y)*/

public class Main {
	
	public static void main(String[] args) {
		
		Point point1 = new Point(9, 6);
		Point point2 = new Point();
		Point point3 = new Point();
		
		point2.setX(7);
		point2.setX(9);
		point2.getX();
		point2.getY();
		
		point3.setXY(2, 5);
		point3.addXY();
		
		point1.display();
		point2.display();
		point3.display();
		
		
	}
	

}
