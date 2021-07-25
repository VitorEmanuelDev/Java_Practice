package primeAndSum;

import java.util.Scanner;

public class PrimeNumberChecking {
	
	int flag = 0;
	
	public void printResult1(){
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scan.nextInt();

        scan.close();
        
        for(int i = 2; i < number; i++) {
        	
        	if(number % i == 0) {
        	
        		flag = 1;
        		break;
        	}
        		
        }
        
        if(flag == 0)
        	System.out.println(number + " is a prime number.");
        else
        	System.out.println(number + " is not a prime number.");
		
	}

}
