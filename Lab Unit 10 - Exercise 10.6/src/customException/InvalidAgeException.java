package customException;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception{

	InvalidAgeException(String message){  
		  super(message);  
	}

}
