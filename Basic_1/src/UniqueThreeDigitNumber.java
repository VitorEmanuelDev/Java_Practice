import java.util.Scanner;

//Write a Java program to create and display unique three-digit number. Also count how many three-digit numbers are there.

public class UniqueThreeDigitNumber {
	
	private static Scanner digit;
	private static int diffCount;

	public static void main() {
		
		diffCount = 0;
		int[] array = new int[4]; 
		
		for (int i = 0; i < array.length; i++) {
			
			digit = new Scanner(System.in); 
			array[i] = digit.nextInt();
			
		}
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				
				for (int k = 0; k < array.length; k++) {
					
					if(i != j && i != k && k != j) {
						
						diffCount++;
						System.out.println(i + "" + j + "" + j);
						
					}
					
				}
				
			}
			
		}
		
		System.out.println("\n" + diffCount);
		
	}

}
