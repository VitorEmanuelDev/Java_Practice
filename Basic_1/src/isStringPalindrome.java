import java.util.Scanner;

// Write a Java program to check if a string is a palindrome or not

public class isStringPalindrome {

    private static Scanner scan;

	public static void main (String [] args) {
    	
        scan = new Scanner(System.in);
        
        int word = scan.nextInt();
        
        scan.nextLine();

        for(int i = 1; i <= word; i++){
            
            String wordCheck = scan.nextLine();
            
            if(ifIsPalindrome(wordCheck)) {
            	
              System.out.println("\"YES\"");
              
            } else {
            	
              System.out.println("\"NO\"");
              
            }

        }
        
    }

    private static boolean ifIsCharPalindrome(String palidrome) {

        boolean ifIsCharPalindrome = true;
        
        String palindrome;
		for(int i = 0; i < palindrome.length(); i++){
        	
          char leftRead = palindrome.charAt(i);
          char rightRead = palindrome.charAt(palindrome.length() - 1 -i);

          if(leftRead == rightRead){
        	  
        	  ifIsCharPalindrome = false;
          }

        }
        return ifIsCharPalindrome;
   
}