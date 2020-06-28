import java.util.Scanner;

public class hello {

	//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
  public static void main(String[] args) {

	  String name;
	  System.out.println("Write your name:");
      Scanner input = new Scanner(System.in);
      name = input.nextLine();

      System.out.println("\nHello");      
      System.out.println(name);
      
      input.close(); 
      
  }
  
}
