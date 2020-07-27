import java.util.Scanner;

//Write a Java program to check if a string is a palindrome

public class isStringPalindrome { 

	private static Scanner scan;

	public static boolean isPalindrome(String word){ 

		for(int i = 0, j = word.length() - 1; i <= word.length()/2; i++, j--){ //read from 0 to the end of the first half of the word with i, and read with j from end to half
			
			if (word.charAt(i) != word.charAt(j)){//if we find a difference, it isn't a palindrome
				
				return false; 
				
			}	
			
		} 

		return true; // no differences means it's a palindrome
		
	} 

	public static void main(String[] args){
		
		String word;
		  
		System.out.println("Write something:");
		  
	    scan = new Scanner(System.in);
	    word = scan.nextLine();

	    if (isPalindrome(word)) {
			
	    	System.out.printf("\"%s\" is a palindrome.", word);
	    	  
	    }else{
			
	    	System.out.printf("\"%s\" is not a palindrome.", word); 
			
	    }
	      
	} 
	
} 
