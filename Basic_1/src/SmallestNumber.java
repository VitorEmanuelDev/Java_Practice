
public class SmallestNumber {
	
	private static int number[];
	private static int smallest;

	public static void main(String[] args){
		
		number = new int[6];
		number[0] = 99;
		number[1] = 45;
		number[2] = 16;
		number[3] = 49;
		number[4] = 12;
		number[5] = 17;
		
		smallest = 0;
		
		for(int current = 0; current < 6; current++) {
			
			if(number[current] < number[smallest]) {
				
				smallest = current;
				
			}
			
		}
		
		System.out.println("The smallest number is " + number[smallest]);
		
	}
	
}