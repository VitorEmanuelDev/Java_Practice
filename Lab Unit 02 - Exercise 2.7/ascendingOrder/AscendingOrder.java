package ascendingOrder;

public class AscendingOrder {
	
	public static void main(String [] args) {
		
		int arrayInt[] = {3,5,6,9,7,8,4,1,2,0};
		
		int size = arrayInt.length;
		int temp;
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < size; j++) {
				
				if(arrayInt[i] < arrayInt[j]) {
					
					temp = arrayInt[i];
					arrayInt[i] = arrayInt[j];
					arrayInt[j] = temp;
					
				}
				
			}
			
		}
		
		for(int i = 0; i < size; i++) {
			
			System.out.print(arrayInt[i] + " ");
			
		}
		
	}

}
