package operatorExamples;

/*2.1 Write a program to give the examples of operators.
2.1.1 Increment and decrement operators.
2.1.2 Bitwise Complement Operator.
2.1.3 Arithmetic operator.
2.1.4 Relational Operator
2.1.5 Bitwise operator.
2.1.6 Conditional Operator. */


public class OperatorExamples {
	
	public static void main(String[] args) {
		
		IncrementDecrementOperators test1 = new IncrementDecrementOperators();
		test1.printExample1();
		
		BitwiseOperatorsAndComplementOperator test2 = new BitwiseOperatorsAndComplementOperator();
		test2.printExample2();
		
		ArithmeticOperators test3 = new ArithmeticOperators();
		test3.printExample3();
		
		RelationalOperators test4 = new RelationalOperators();
		test4.printExample4();
		
		ConditionalOperators test5 = new ConditionalOperators();
		test5.printExample5();
		
		
	}

}
