import java.util.Scanner;

//Write a Java program to print 'Hello' on screen and then print your name on a separate line.

public class Hello {

	private static Scanner scan;

	public static void main(String[] args) {

	  String name;
	  System.out.println("Write your name:");
      scan = new Scanner(System.in);
      name = scan.nextLine();

      System.out.println("\nHello");      
      System.out.println(name);
      
  }
  
}
