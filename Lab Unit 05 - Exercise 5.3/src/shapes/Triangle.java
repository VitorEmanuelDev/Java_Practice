package shapes;

public class Triangle extends Shape{
	
	public double base;
	public double height; 
	
	public Triangle(String color, double base, double height) {
		super(color);
		//System.out.println("Building a triangle");
		this.base = base;
		this.height = height;
	
	}

	@Override
	public double area() {
		
		//System.out.println("Calculating triangle area");
		return (base * height) / 2;
		
	}
	
	@Override
	public String toString() {
		
		return "The triangle color is " + super.getColor() + ", and the area is " + Math.round(area()) + " m²"; 
		
	}

}
