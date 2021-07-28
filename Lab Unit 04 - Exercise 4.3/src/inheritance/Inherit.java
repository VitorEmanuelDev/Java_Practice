package inheritance;

import inheritance.Aa;
import inheritance.Bb;

/*4.3 Create class named as ‘a’ and create a sub class ‘b’. Which is extends from
class ‘a’. And use these classes in ‘inherit’ class.*/

public class Inherit {
	
	public static void main (String args[]){
		
		Aa superObject = new Aa();
		Bb subObject = new Bb();
		
		superObject.testA = 3;
		
		System.out.println("Called with super object:");
		superObject.methodAa() ;
		
		subObject.testA = 1;
		subObject.testB = 2;

		System.out.println ("Called with sub object:" );
		subObject.methodAa() ;
		subObject.methodBb();
		
		System.out.println ("Sum of testA and testB:" );
		subObject.sumAB();
	}

}
