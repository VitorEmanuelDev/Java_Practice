 package shapes;

public abstract class Shape {
	
	String color;
	
	public abstract double area();
	
	public abstract String toString();
	
	public Shape(String color) {
		
		System.out.println("Coloring shape");
		this.color = color;
		
	}
	
	public String getColor() {
		
		return color;
	
	}

}
