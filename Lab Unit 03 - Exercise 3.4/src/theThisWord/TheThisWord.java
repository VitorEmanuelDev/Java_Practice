package theThisWord;


/*3.4 Write a program to give the example for ‘this’ operator. And also use the
‘this’ keyword as return statement.*/

public class TheThisWord {
	
	public static void main(String [] args) {
		
		CallByReferenceWithThisWord reference = new CallByReferenceWithThisWord(); 
		   
	    System.out.println("(By reference with 'this') before change " + reference.data);  
	    reference.changeWithThisByReference(50);  
	    System.out.println("(By Reference with 'this') after change " + reference.data);  
		   
		
	}

}
