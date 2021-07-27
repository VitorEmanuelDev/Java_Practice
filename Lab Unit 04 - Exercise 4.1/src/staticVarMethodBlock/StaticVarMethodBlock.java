package staticVarMethodBlock;

/*4.1 Write a program to demonstrate static variables, methods, and blocks. */

public class StaticVarMethodBlock {
	
	//static varriables
	static int a = 13;
	static int b;
	
	//static block
	static {
		
		System.out.println("Static initialization block.");
		b = a + 7;
		
	}
	
	//static method
	static void staticMethod(int c) {
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}
	
	public static void main(String [] args) {
			
		staticMethod(9);
			
	}

}
