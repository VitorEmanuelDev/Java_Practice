

//Write a Java program to find the largest prime factor

public class largestPrimeFactor {


	public static int largestPrimeFactor(int number) {
		
        int i;

        for (i = 2; i <= number; i++) {
        	
            if (number % i == 0) {
            	
                number /= i;
                
                i--;
                
            }
            
        }

        return i;
        
    }
	
	public static void main(String[] args) {
		
		
		int number = 99;
		
		System.out.println(largestPrimeFactor(number));//type a number you want to test
		
	}
	
}