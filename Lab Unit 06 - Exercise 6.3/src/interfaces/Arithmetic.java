package interfaces;

public class Arithmetic implements Test{

	double square;
	
	@Override
	public double square(double num) {
		
		square = Math.pow(num, 2);
		
		return square;
	}	

}
