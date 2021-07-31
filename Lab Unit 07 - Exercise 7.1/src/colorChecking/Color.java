package colorChecking;

public abstract class Color {
	
	int red;
	int green;
	int blue;
	float hue;
	float saturation;
	float brightness;
	float hsb [];


	public Color(int red, int green, int blue) {
		
		this.red = red;
		this.green = green;
		this.blue = blue;
		
	}

	public int getRed() {

		return red;
		
	}

	public int getGreen() {
		
		return green;
		
	}

	public int getBlue() {
		
		return blue;
		
	}
	
	
	public abstract void RGBtoHSB(int red, int green, int blue, float[] hsb);

	
}
