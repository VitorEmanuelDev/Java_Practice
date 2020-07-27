import java.util.Scanner;

//Write a Java program to count the letters, spaces, numbers and other characters of an input string.


public class countString {

	private static String sentence;
	private static Scanner scan;
	private static char character;
	private static int letter = 0;
	private static int number = 0;
	private static int space = 0;
	private static int other = 0;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in); 
		
		System.out.print("Type a sentence:\n");
		
		  sentence = scan.nextLine();
		  
		  for(int i = 0; i < sentence.length(); i++){
			  
			  character = sentence.charAt(i);
			  
			  if((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
		     
				  letter++; 
				  	
			  }else if(character >= 48 && character <= 57){
				  
				  number++;
			  
			  } else if(character == 32) {
				  
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
	

