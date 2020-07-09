
//Write a Java program to create and display unique three-digit number from 1, 2, 3 and 4. Also count how many three-digit numbers are there.

public class UniqueNumberDigit {

	public static void main(String[] args){
		
		int diffCount = 0;
		
		for(int i = 1; i < 5; i++){
			
			for(int j = 1; j < 5; j++){
				
				for(int k = 1; k < 5; k++){
					
					if(i != j && i != k && j != k){
						
						diffCount++;
						System.out.println(i + "" + j + "" + k);
						
					}
					
				}
				
			}
			
		}
		
		System.out.println("\nThere are " + diffCount + " possible combinations.");
		
	}

}
