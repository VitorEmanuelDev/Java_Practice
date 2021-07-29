package shapes;

/*5.1 Write a program to create a class named shape. In this class we have three
sub classes circle, triangle and square each class has two member function
named draw () and erase (). Create these using polymorphism concepts.*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
	    Scanner choice = new Scanner(System.in);
	    
	    System.out.println("Pick one:\n1 - Circle\n2 - Square\n3 - Triangle");
	    Integer shape = choice.nextInt(); 
	   	    
	    choice.close(); 
	    
	    switch(shape) {
	    case 1:
	    	Circle circle = new Circle("blue", 3.4);
	    	System.out.println(circle.toString());
	    	break;
	    case 2:
	    	Triangle triangle = new Triangle("yellow", 5.1, 6.3);
	    	System.out.println(triangle.toString());
	    	break;
	    case 3:
	    	Square square = new Square("red", 4.5);   
	    	System.out.println(square.toString());
	    	break;
	    default:
	      System.out.println("Invalid choice.");
	  }
		
	}

}
