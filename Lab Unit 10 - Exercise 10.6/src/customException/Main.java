package customException;

//10.6 Write a program for creation of user defined exception.

public class Main {

	public static void validate(int age)throws InvalidAgeException{  
		if(age < 21)  
			throw new InvalidAgeException("Invalid age");  
		else  
			System.out.println("You're in!");  
   }  
     
   public static void main(String args[]){  
      
	   try{
		   
		   validate(19);
		   
	   }catch(Exception m){
		
		   System.out.println("Exception occured: " + m);
		   
	   }  
  
  }  
	
}
