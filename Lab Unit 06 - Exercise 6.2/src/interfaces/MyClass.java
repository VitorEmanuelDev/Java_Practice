package interfaces;

public class MyClass implements InterfaceA, InterfaceB{

	@Override
	public void method1() {
		
		InterfaceA.super.method1();
		
		InterfaceB.super.method1();
		
	}	

}
