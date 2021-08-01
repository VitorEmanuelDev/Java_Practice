package boxes;

public class Box {

	private int length;
	private int breadth;
	
	public Box() {
		
	}

	public Box(int length, int breadth) {
		
		this.setLength(length);
		this.setBreadth(breadth);
		
	}

	public void setDimensions(int length, int breadth){
		
		this.setLength(length);
		this.setBreadth(breadth);
	
	}	
	public int area(){
			
		return (getLength() * getBreadth());
		
	}

	public int getLength() {
		return this.length;
	}

	private void setLength(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return this.breadth;
	}
	
	private void setBreadth(int breadth) {
		this.breadth = breadth;		
	}

}
