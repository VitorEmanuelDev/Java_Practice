import java.util.Scanner;

//Write a Java program to find the greatest common denominator of two numbers

public class greatestCommonDenominator {

	public static void main(String[] args) {
	
		int gcd = 1;
    
		Scanner scan = new Scanner (System.in);
	 
		System.out.print("Type two numbers:\n");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
	  

		for(int i = 1; i <= number1 && i <= number2; i++){
			
			if(number1 % i == 0 && number2 % i == 0){
			
				gcd = i;
            
			}
			
		}

		System.out.println("The greatest common denominator of " + number1 + " and " + number2 + " is " + gcd);
    
	}

}
