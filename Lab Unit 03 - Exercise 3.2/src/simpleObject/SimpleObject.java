package simpleObject;

public class SimpleObject {
	
	String message;
	
	public SimpleObject() {
		
		System.out.println("No args constructor (test)");
		
	}
	
	public SimpleObject(String msg) {
		
		message = msg;
		
		System.out.println(message);
		
	}

}
