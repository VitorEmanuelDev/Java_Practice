package exceptions;

/*10.3 Write a program to illustrate sub class exception precedence over base
class.*/

public class Exceptions {
	
    public static void main(String [] args){
    	
        SuperClass classSuper = new SubClass();
        classSuper.method();
    
    }

}
