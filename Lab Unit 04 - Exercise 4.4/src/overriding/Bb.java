package overriding;

class Bb extends Aa{
	
	int z;
	
	Bb(){
		x = 0;
		y = 0;
		z = 0;
	}
	
	Bb(int a, int b, int c){
		x = a;
		y = b;
		z = c;
	}
	
	void display(){
		
	System.out.println ("With Bb extends Aa x y z == " + x + " " + y + " " + z);
	
	}

} 
