import java.util.Scanner;

//Write a Java program to check if a number is also equal to the sum of its factors.

public class PerfectNumber {
	
	private static int sum;
	private static Scanner scan;

	public static void main(String[] args) {
	
		scan = new Scanner (System.in);
	 
		System.out.print("Type one number:\n");
		int number = scan.nextInt();
	
		sum = 0;
	
		for(int i = 1; i < number; i++){
		
			if(number % i == 0){
		
				sum += i;
        
			}
		
		}
	
		if(number == sum){
		
			System.out.printf("%d is a perfect number.", number);
		
		}else {
		
			System.out.printf("%d is not a perfect number.", number);
		
		}

	}

}
