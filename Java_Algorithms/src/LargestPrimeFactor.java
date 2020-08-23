import java.util.Scanner;

//Write a Java program to find the largest prime factor

public class LargestPrimeFactor {


	private static Scanner scan;

	public static int LargestPrimeFactorMethod(int number) {
		
        int i;

        for (i = 2; i <= number; i++) {
        	
            if (number % i == 0 && number / i != 1) {
            	
                number = number / i;
                break;
                
            }
            
        }

        return number;
        
    }
	
	public static void main(String[] args) {
				
		scan = new Scanner (System.in);
		
		System.out.print("Type one number:\n");
		int number = scan.nextInt();
		
		System.out.println(LargestPrimeFactorMethod(number));
		
	}
	
}