import java.util.Scanner;


public class stringReverse {

	private static String str;
	private static Scanner scan;
	private static char ch;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in); 
		
		System.out.print("Type a sentence:\n");
		
		  str = scan.nextLine();
		  
		  scan.close();
		  
		  for(int i = str.length() - 1; i >= 0; i--){
			  
		     ch = str.charAt(i);
		     System.out.print(ch);
		     
		  }
		  
		  
	}
	
}
