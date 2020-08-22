import java.util.Scanner;

//Write a Java program to find out if the first or last value is bigger

public class compareFirstLast {
	
	private static Scanner scan;
	private static int size;
	private static int array[];

	public static void main(String[] args) {
		
		System.out.println("How many values can the array have?\n");
		scan = new Scanner(System.in);
		size = scan.nextInt();
		
		array = new int[size]; 
		
		System.out.println("Input the array's values:\n");
		
	    for(int i = 0; i < size; i++){
	    	
	    	scan = new Scanner(System.in);
			array[i] = scan.nextInt();
	    	System.out.printf("array[%d] = %d\n", i, array[i]);
			
	    }
	    
	    if(array[0] > array[size - 1]){
	        
	    	System.out.println("\nBetween the first and the last, the first value is bigger.");
	    			
	    } else {
	        
	    	System.out.println("\nBetween the first and the last, the first value is bigger.");
	        
	    }
		
	}

}
