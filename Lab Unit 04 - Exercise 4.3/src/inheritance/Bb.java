package inheritance;

public class Bb extends Aa{
	
	int testB;
	
	void methodBb() {
		
		System.out.println("test B = " + testB);
		
	}
	
	void sumAB() {
		
		System.out.println(testA + testB);
		
	}

}
