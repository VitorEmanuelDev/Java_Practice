package overriding;

class Aa{
	
	int x, y;
	
	Aa(){
		x = 0;
		y = 0;
	}
	
	Aa(int a, int b){
		x = a;
		y = b;
	}
	
	void display(){
		
		System.out.println ("Without Bb extends Aa x y == " + x + " " + y);
	
	}
} 