package tryCatch;

/*10.1 Write a program for example of try and catch block. In this check
whether the given array size is negative or not.*/

public class TryCatchExample {
	
	public static void main(String[] args){
		 
	    try {
	    	
	    	int array1[] = new int[-2];
	        System.out.println("array1 at position 0: " + array1[0]);
	    	//int array2[] = new int[3];
	    	//array2[1] = 99;
	    	//System.out.println("array2 at position 1: " + array2[1]);
	    
	    } 
	        
	    catch (NegativeArraySizeException e) {
	    
	    	System.out.println("Exception caught: Negative array for array1");
	        
	    } 
	    
	    finally {
	    	
	            System.out.println("It is what it is...");
	        
	    }
	    
	}

}
