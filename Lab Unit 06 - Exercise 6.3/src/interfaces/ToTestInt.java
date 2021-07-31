package interfaces;

/*6.3 Write a program to create interface named test. In this interface the
member function is square. Implement this interface in arithmetic class.
Create one new class called ToTestInt in this class use the object of
arithmetic class.*/

public class ToTestInt {
	
	public static void main(String[] args) {
		
		Arithmetic test = new Arithmetic();
		System.out.println(test.square(5));
		
	}

}
