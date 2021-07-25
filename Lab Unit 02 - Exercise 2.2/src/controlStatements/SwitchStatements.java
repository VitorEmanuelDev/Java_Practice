package controlStatements;

public class SwitchStatements {
	
	final int x = 5;
	final int y = 7;
	
	public void printExample2() {
		
		switch(x) {
		
		  case x:
		    System.out.println("That's what you were trying");
		    break;
		    
		  case y:
			System.out.println("That's NOT what you were trying");
		    break;
		    
		  default:		
			  System.out.println("None of the cases matched");
		}
		
	}

}
