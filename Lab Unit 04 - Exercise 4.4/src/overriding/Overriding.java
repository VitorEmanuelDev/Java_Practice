package overriding;

/*4.4 Write a program to give the example for method overriding concepts.*/

public class Overriding {
	
	public static void main (String [] args){
		 
		Aa superObject = new Aa(1,5);
		Bb subObject = new Bb(9,6,3);
		
		superObject.display();
		subObject.display() ;
			 
	 } 

}
