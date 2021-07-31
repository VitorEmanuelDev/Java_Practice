package colorChecking;

import java.awt.Color;


/*7.1 Write a class called ColourChecking. Define a color with red = 193, green
=255 and blue = 183. No separate the rgb values. Find the Hue, saturation
and brightness of this color.*/

public class ColorChecking {
	
	public static void main(String [] args) {
		
		Color rgb = new Color(150, 250, 175);
		
		int red, green, blue;
		
		red = rgb.getRed();
		green = rgb.getGreen();
		blue = rgb.getBlue();
				
		System.out.println("Red: " + red + " Green: " + green + " Blue: " + blue);
		
		float [] hsb = Color.RGBtoHSB(red, green, blue, null);
		
		float hue = hsb[0];
		 
		float saturation = hsb[1];
		 
		float brightness = hsb[2];
		
		System.out.println("Hue: " + hue + " Saturation: " + saturation + " Brightness: " + brightness);
		
		
	}

}
