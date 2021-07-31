package fonts;

import java.awt.Font;

/*7.2 Write a program to check the font class method as follows: Create a font
TimesRoman bold and Italic size 12. In this object use the font methods.
Then display the attributes of the font.*/

public class FontChecking {
	
	public static void main(String [] args) {
		
		Font ft = new Font("TimesNewRoman", Font.BOLD + Font.ITALIC, 12);		
		
		String font = ft.getName();
		int style = ft.getStyle();
		int size = ft.getSize();
		boolean bold = ft.isBold();
		boolean normal = ft.isPlain();
		boolean italic = ft.isItalic();
		
		System.out.println("Font: " + font + "\nStyle: " + style + "\nSize: " + size + "\nBold: "+ bold + "\nItalic: " + italic + "\nPlain: " + normal);
		
	}
	

}
