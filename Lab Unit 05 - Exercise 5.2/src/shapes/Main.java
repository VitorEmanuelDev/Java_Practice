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
	    
	    System.out.println("1 - Erase\n2 - Draw");
	    Integer action = choice.nextInt(); 
	    
	    choice.close(); 
	    
	    switch(shape) {
	    case 1:
	    	Circle circle = new Circle();
	    	if(action == 1)
	        	circle.erase();
	        else
	        	circle.draw();    
	    	break;
	    case 2:
	    	Triangle triangle = new Triangle();
	    	if(action == 1)
	    		triangle.erase();
	    	else
	    		triangle.draw();    
	    	break;
	    case 3:
	    	Square square = new Square();
	    	if(action == 1)
	    		square.erase();
	        else
	        	square.draw();    
	    	break;
	    default:
	      System.out.println("Invalid choice.");
	  }
		
	}

}
