package recursion;

public class Fibonacci {
	
	int result;

	public int fibonacci(int n) {
		
		if(n <= 1) { 
		
			return 1;
			
		}else {
			
			 return fibonacci(n - 1) + fibonacci(n - 2);
			
		}
		
	}

}
