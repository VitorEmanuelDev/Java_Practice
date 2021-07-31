package colorChecking;

public class Color {
	
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
	
	
	public void RGBtoHSB(int red, int green, int blue, float[] hsb) {}
	
	
	public static int HSBtoRGB(double hue, double saturation, double brightness) {
		
		return 0;
	}

	
}
