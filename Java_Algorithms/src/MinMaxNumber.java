import java.util.Scanner;

//Write a Java program to classify the minimum and maximum values typed by the user

public class MinMaxNumber {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while(true){
			
			System.out.printf("Type a number:\n");
			
			boolean isNumber = scan.hasNextInt();
			
			if(isNumber) {
				
				int number = scan.nextInt();
				
				if(number > max){
					
					max = number;
					
				}
				
				if(number < min){
					
					min = number;
					
				}
				
			} else {
				
				break;
				
			}
			
		}
		
		System.out.printf("minimum = %d, maximum = %d", min, max);
		
	}

}
