package quadraticEquationRoot;

import java.util.Scanner;
import java.lang.Math;

/*2.8 Write a program to calculate the roots of Quadratic equations.*/

public class QuadraticEquationRoot {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter (a)x²: ");
        int a = scan.nextInt();
        
        System.out.print("Enter (b)x: ");
        int b = scan.nextInt();
        
        System.out.print("Enter c: ");
        int c = scan.nextInt();

        scan.close();
        
        Double x1 = (-b + Math.sqrt((b * b) -4 * a * c))/ 2 * a;
        
        Double x2 = (-b - Math.sqrt((b * b) -4 * a * c))/ 2 * a;
        
		System.out.println("Root 1 = " + Math.round(x1));
		System.out.println("Root 2 = " + Math.round(x2));
        
	}

}
