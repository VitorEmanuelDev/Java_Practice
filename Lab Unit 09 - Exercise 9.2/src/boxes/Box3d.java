package boxes;

public class Box3d extends Box{
	
	private int height;
	
	public Box3d(){
	
		super();

	} 
	
	public Box3d(int lenght, int breadth, int height) {

		super(lenght, breadth);
		this.setHeight(height);
		
	}
	
	public void setDimensions(int lenght, int breadth, int height) {
		
		super.setDimensions(getLength(), getBreadth());
		this.setHeight(height);
		
	}

	public int volume() {
		return (super.area() * height);
	}
	
	public int getHeight() {
		return this.height;
	}
	
	private void setHeight(int height) {
		this.height = height;		
	}

}
