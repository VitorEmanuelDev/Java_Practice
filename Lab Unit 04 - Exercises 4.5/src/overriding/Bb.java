package overriding;

class Bb extends Aa{
	
	int z;
	
	Bb(){
		
		super();
		z = 0;
		
	}
	
	Bb(int a, int b, int c){
		
		super(a, b);
		z = c;
		
	}
	
	void display(){
		
		super.display();
		System.out.println ("With Bb extends Aa x y z == " + x + " " + y + " " + z);
	
	}

} 
