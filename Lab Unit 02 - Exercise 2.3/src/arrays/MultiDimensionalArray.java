package arrays;

public class MultiDimensionalArray {
	
	int array3D[][][] = {{{3,4},{5,7}},
					{{8, 9},{1, 2}}};
	int size = 0;
	
	public void printExample4() {
		
		size = array3D.length;
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < size; j++) {
				
				for(int k = 0; k < size; k++){
					
					System.out.println(array3D[i][j][k]);
										
				}
			}
		}
	}

}
