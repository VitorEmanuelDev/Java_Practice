import java.util.*;

//Write a Java program and compute the sum of the digits of an integer.

public class sumIntegerDigits {
	
	private static String str;
	private static int num;
	private static char ch;
	private static int digit;
	private static int sum;
	
	public static void main(String[] args){
		  
		  Scanner scan = new Scanner (System.in);
	    
		  System.out.print("Type an integer:\n");
		  num = scan.nextInt();
		  
		  scan.close();
		  
		  setStr(String.valueOf(num));
		  
		  char[] charArray = str.toCharArray();
		  
		  for (int i = 0; i < charArray.length; i++) {
			
			  ch = charArray[i];
			 digit = Integer.parseInt(String.valueOf(ch));
			 sum += digit;
					
		  } 
		  
		  System.out.println("The digit sum is: " + sum);
	    
	  }

	public static String getStr() {
		return str;
	}

	public static void setStr(String str) {
		sumIntegerDigits.str = str;
	}
}
