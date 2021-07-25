package trianglesOfBinaryDigits;

public class Triangle3 {

	public void printTriangle3() {
		
		int multiplier = 1;
		int result = 0;
		int temp;
		
		for(int i = 1; i < 6; i++) {
			
			if(i == 1) {
				
				result = i * multiplier;
				multiplier = multiplier * 10;
				System.out.println(result);
				
			}else {
				
				result = result * multiplier + i;
				System.out.println(result);
				
			}
			
		}
		
		System.out.print("\n");
		
	}
	
}
