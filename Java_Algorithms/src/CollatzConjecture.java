import java.util.Scanner;

//https://en.wikipedia.org/wiki/Collatz_conjecture
//float types should work better

public class CollatzConjecture {
	
	private static int number;
	private static Scanner scan;
	private static int integers;
	private static int counter;

	public static void collatz(String[] args){
	
		scan = new Scanner (System.in);
	 
		System.out.println("Type an integer:");
		number = scan.nextInt();
	
		integers = number;
		counter = 0;
	
		do{
			
			System.out.println(integers);
			counter++;
		
			if(integers % 2 == 0) {
				
				integers /= 2;
				
			}else{
				
				if(integers == 1) {
				
					break;
				
				} else {
					
					integers = integers * 3 + 1;				
				
				}
				
			}
			
		}while(integers > 0);
		
		System.out.println("\nNumbers printed: " + counter);
	
	}
	

}

