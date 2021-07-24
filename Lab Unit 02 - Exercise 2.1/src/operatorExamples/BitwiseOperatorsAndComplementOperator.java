package operatorExamples;

public class BitwiseOperatorsAndComplementOperator {
	
	int x = 8;
	int y = 9;
	
	public void printExample2() {
		
		System.out.println("Bitwise Operator examples and Bitwise Complement Operator:\n");
		
		System.out.println("8 & 9 = "+ (x & y));
		System.out.println("8 | 9 = "+ (x | y));
		System.out.println("8 ^ 9 = "+ (x ^ y));
		System.out.println("~8 = "+ ~x);
		
		System.out.print("\n");
		
	}

}
