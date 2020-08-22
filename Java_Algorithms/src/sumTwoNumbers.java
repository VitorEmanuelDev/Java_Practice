import java.util.Scanner;

//Write a Java program to print the sum of two numbers. 

public class sumTwoNumbers {

  public static void main(String[] args){
	  
	  Scanner scan = new Scanner (System.in);
    
	  System.out.print("Input two numbers:\n");
	  int num1 = scan.nextInt();
	  int num2 = scan.nextInt();
	  
	  scan.close();
	  
	  int sum = num1 + num2;
	  
	  System.out.println(num1 + " + " + num2 + " = " + sum);
    
  }
  
}