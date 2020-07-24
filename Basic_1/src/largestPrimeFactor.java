import java.util.Scanner;

//Write a Java program to find the largest prime factor

public class largestPrimeFactor {


	private static Scanner scan;

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
		
		
		scan = new Scanner (System.in);
		
		System.out.print("Type one number:\n");
		int number = scan.nextInt();
		
		System.out.println(largestPrimeFactor(number));//type a number you want to test
		
	}
	
}