package callByValueAndCallByReference;

/*3.3 Write a program for the following
1. Example for call by value.
2. Example for call by reference.*/

public class CallByValueAndCallByReference {

	 public static void main(String args[]){  
		 
		 
	   CallByValue value = new CallByValue();  
	   
	   System.out.println("(By value) before change " + value.data);  
	   value.changeByValue(500);
	   System.out.println("(By value) after change " + value.data);  
	   
	   CallByReference reference = new CallByReference(); 
	   
	   System.out.println("(By reference) before change " + reference.data);  
	   reference.changeByReference(reference);  
	   System.out.println("(By Reference) after change " + reference.data);  
	   
	  
	  
	 }  
		

}
