import java.util.Scanner;

//Write a Java program to count the letters, spaces, numbers and other characters of an input string.


public class countString {

	private static String str;
	private static Scanner scan;
	private static char ch;
	private static int letter = 0;
	private static int number = 0;
	private static int space = 0;
	private static int other = 0;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in); 
		
		System.out.print("Type a sentence:\n");
		
		  str = scan.nextLine();
		  
		  scan.close();
		  
		  for(int i = 0; i < str.length(); i++){
			  
			  ch = str.charAt(i);
			  
			  if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
		     
				  letter++; 
				  	
			  }else if(ch >= 48 && ch <= 57){
				  
				  number++;
			  
			  } else if(ch == 32) {
				  
				  space++;
				  
			  }else{
				  
				  other++;
			  
			  }
			    
			    
		  }
		  
		  System.out.println("Letter: " + letter);
		  System.out.println("Number: " + number);
		  System.out.println("Space: " + space);
		  System.out.println("Other: " + other);
	
	}
		  
}
	

