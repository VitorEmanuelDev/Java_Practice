package multipleCatch;

/*10.2 Write a program for example of multiple catch statements occurring in a
program.*/

public class MultipleCatch {
	
	public static void main(String[] args){
		
		try{ 
		
			int array[] = new int[5]; 
			array[3] = 20 / 0; 
	
		} 
		
		catch(ArithmeticException ae){
			
			System.out.println("Illegal operation: Division by zero"); 
		
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Out of bounds: Array element outside of specified limit"); 
		
		} 
		catch(Exception e){
			
			System.out.println(e.getMessage()); 
		
		} 
		
		finally {
		
			System.out.println("That's it."); 
		
		}
	 
	} 

}
