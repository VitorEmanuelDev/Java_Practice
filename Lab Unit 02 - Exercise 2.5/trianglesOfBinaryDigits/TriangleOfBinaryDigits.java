package trianglesOfBinaryDigits;

/*2.5 Write a program to print the following triangle of binary digits.
	2.5.1 
	1 				2.5.2  5
	1 0 1				   4 5
	1 0 0 0 1 			   3 4 5
	1 0 0 0 0 0 1		   2 3 4 5
	1 0 0 0 0 0 0 0 1	   1 2 3 4 5
	 					   0 1 2 3 4 5
	2.5.3  1
	       1 2
	       1 2 3
	       1 2 3 4
	       1 2 3 4 5 */

public class TriangleOfBinaryDigits {
	
	public static void main(String[] args) {
		
		Triangle1 test1 = new Triangle1();
		test1.printTriangle1();
		
		Triangle2 test2 = new Triangle2();
		test2.printTriangle2();
		
		Triangle3 test3 = new Triangle3();
		test3.printTriangle3();
	
	}
	

}
