package shapes;

public class Square extends Shape{
	
	public double side;
	
	public Square(String color, double side) {
		
		super(color);
		//System.out.println("Building a square");
		this.side = side;		
		
	}
	
	@Override
	public double area() {
		
		//System.out.println("Calculating square area");
		return Math.pow(side, 2);
		
	}
	
	@Override
	public String toString() {
		
		return "The square color is " + super.getColor() + ", and the area is " + Math.round(area()) +  " m²"; 
		
	}
	
}
