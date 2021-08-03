package tryCatchFinally;

public class TryCatchFinally {
	
	public static void main (String[] args){
         
	    int[] array = new int[4];
	     
	    try{
	    	
	        int whatever = array[4];
	
	    }
	     
	    catch(ArrayIndexOutOfBoundsException out) {
	    
	        System.out.println("Ohh no... You messed up... It's out of bounds...");
	        
	    }
	     
	    finally {
	    
	        System.out.println("It is what it is!");
	    }
     
	}

}
