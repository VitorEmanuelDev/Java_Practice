package arrays;

public class TwoDimensionalArray {
	
	int array2D [][] = {{1,2,3},
						{7,8,9},
						{4,5,6}};
	int size = 0;
	
	public void printExample2() {
		
		size = array2D.length;
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < size; j++) {

				System.out.print(array2D[i][j] + " ");
				
				if(array2D[i][j] % 3 == 0) {
					
					System.out.print("\n");
					
				}
			
			}
			
		}
		
	}

}
