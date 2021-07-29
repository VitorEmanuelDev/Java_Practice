package shapes;

public class Circle extends Shape{
	
	public double radius;

	public Circle(String color, double radius) {
		
		super(color);
		//System.out.println("Building a circle");
		this.radius = radius;
		
	}

	@Override
	public double area() {
		
		//System.out.println("Calculating circle area");
		return Math.PI * Math.pow(radius, 2);
		
	}
	
	@Override
	public String toString() {
		
		return "The color of the circle is " + super.getColor() + ", sand the area is " + Math.round(area()) + " m²"; 
		
	}

}
