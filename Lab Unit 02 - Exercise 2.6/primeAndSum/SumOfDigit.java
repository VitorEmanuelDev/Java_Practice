package primeAndSum;

import java.util.Scanner;

public class SumOfDigit {

	public void printResult2() {
		
		/*Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scan.nextInt();

        scan.close();*/
		
		int number = 123456789;
		System.out.println("\nNumber = " + number);
        
        int digits = number;
        int temp;
        int sum = 0;
        
        while(digits > 0) {
        	
        	temp = digits % 10;
        	sum += temp;
        	digits = digits / 10;
        	
        }
        
        System.out.println("Digit sum = " + sum);
		
	}
	
}
