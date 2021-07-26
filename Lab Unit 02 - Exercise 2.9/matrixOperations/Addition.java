package matrixOperations;

public class Addition {
	
	public void printAddition() {
		
		int array1[][] = {{4,7,3},{7,8,1},{1,1,5}};
		int array2[][] = {{8,4,3},{4,1,1},{2,1,0}};
		int array3[][] = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
			 
				array3[i][j] = array1[i][j] + array2[i][j];
			 
			}
		 
		}
		
		for(int i = 0; i < 3; i++){
			
			System.out.print("\n");
			
			for(int j=0; j < 3;j++) {
				
			 System.out.print(" " + array3[i][j]);
			 
			}
		} 
		
		System.out.print("\n");
			
	}

}
