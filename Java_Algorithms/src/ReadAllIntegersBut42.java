import java.util.Scanner;

/*Your program is to use the brute-force approach in order to find the Answer
to Life, the Universe, and Everything. More precisely... rewrite small numbers
from input to output. Stop processing input after reading in the number 42.
All numbers at input are integers of one or two digits. */

public class ReadAllIntegersBut42 {

    private static Scanner scan;
	private static int size;
	private static int[] array;

	public static void main(String[] args){
		
		System.out.println("How many values do you want?");
		scan = new Scanner(System.in);
		size = scan.nextInt();
		
		array = new int[size]; 
		
		System.out.println("Which values do you want on that list?");
		
		for(int i = 0; i < size; i++){
		    	
	    	scan = new Scanner(System.in);
			array[i] = scan.nextInt();
			
			if(array[i] > 99 || array[i] < -99) {
				
				System.out.println("Invalid input. Type another value for this position.");
				i--;
				
			}
				
		}
        
		System.out.println("\n");
        
		for(int i = 0; i < size; i++){
            
            if(array[i] == 42) { 
            	
            	break;
            
            }else{
            
            	System.out.println(array[i]);
            
            }
            
        }
        
    }

}
