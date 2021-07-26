package matrixOperations;

public class Multiplication {
	
	public void printMultiplication() {
		
		
		int array1[][] = {{8,4,3},{4,4,1},{8,1,0}};
		int array2[][] = {{4,7,3},{4,7,8},{5,6,8}};
		int array3[][] = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
			 
				array3[i][j] = 0;
				
				for(int k = 0; k < 3; k++) {
				
					array3[i][j] += array1[i][k] * array2[k][j];
				 
				}
			} 
		}
		
		for(int i = 0; i < 3; i++){
			
			System.out.print("\n");
			
			for(int j = 0; j < 3;j++) {
				
			 System.out.print(" " + array3[i][j]);
			 
			}
		} 
			
	}

}
