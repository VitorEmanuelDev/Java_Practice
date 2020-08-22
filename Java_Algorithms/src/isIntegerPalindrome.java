import java.util.Scanner;

//Write a Java program to check if a number is a palindrome. 

public class isIntegerPalindrome {

	 private static Scanner scan;

	public static void main(String args[]){  
		 
		 int remainder, sum = 0, originalNumber;    
		 scan = new Scanner (System.in);
		 
		 System.out.print("Type a number:\n");
		  int number = scan.nextInt();
		  
		  originalNumber = number;  
		  
		  while(number > 0){   
			  
			  remainder = number % 10;  //to get the last digit ex: 234 % 10 = 4 
		  
			  sum = (sum * 10) + remainder;   
		   
			  number = number / 10;
		   
		  }   
		  
		  if(originalNumber == sum){
			  
		   System.out.println(sum + " is a palindrome.");
		   
		  }else{   
			  
		   System.out.println(originalNumber + " is not a palindrome");    
		
		  }  
		 
	 }

}
