package interfaces;

public class OuterClass {
	
	void display() {
		
		System.out.println("Outer class");
		
	}
	
	void test(){
		
		InnerClass inner = new InnerClass();
		inner.display();		
	} 

}
