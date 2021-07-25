package trianglesOfBinaryDigits;

public class Triangle2 {
	
	public void printTriangle2() {
		
		int multiplier = 1;
		int result = 0;
		int temp;
		
		for(int i = 5; i >= 0; i--) {
		
			if(i == 5) {
				
				result = i * multiplier;
				multiplier = multiplier * 10;
				System.out.println(result);
				
			}else {
				
				temp = result;
				result = i * multiplier + temp;
				multiplier = multiplier * 10;
				if(i == 0)
					System.out.println("0" + result);
				else
					System.out.println(result);
				
			}
					
			
		}
		
		System.out.print("\n");
		
	}

}
