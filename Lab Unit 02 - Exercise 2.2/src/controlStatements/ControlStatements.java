package controlStatements;

/*2.2 Write a program to give the example of control statements.
2.2.1 If statements.
2.2.2 Switch Statements.
2.2.3 For loop.
2.2.4 While Statements.
2.2.5 Do statements */

public class ControlStatements {

	public static void main(String[] args) {
		
		IfStatements test1 = new IfStatements();
		test1.printExample1();
		
		SwitchStatements test2 = new SwitchStatements();
		test2.printExample2();
		
		ForLoop test3 = new ForLoop();
		test3.printExample3();
		
		WhileLoop test4 = new WhileLoop();
		test4.printExample4();
		
		DoWhileLoop test5 = new DoWhileLoop();
		test5.printExample5();
		
	}
	
}
