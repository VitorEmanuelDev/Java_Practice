package callByValueAndCallByReference;

public class CallByReference {

	 int data = 50;  
	  
	 void changeByReference(CallByReference reference){  
		 
		 reference.data = reference.data + 100; 
		 
	 }  
	
}
