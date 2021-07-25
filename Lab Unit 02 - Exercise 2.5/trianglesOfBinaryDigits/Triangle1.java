package trianglesOfBinaryDigits;

public class Triangle1 {
	
	public void printTriangle1(){
		
		int number = 1;
		int multiplier = 1;
		int one = 1;
		int result;
		
		for(int i = 0; i < 5; i++) {
		
			if(i == 0) {
				
				result = number * multiplier;
				multiplier = multiplier * 100;
				
			}else {
				
				result = number * multiplier + one;
				multiplier = multiplier * 100;
				
			}
				System.out.println(result);
			
		}
		
		System.out.print("\n");
		
	}

}
