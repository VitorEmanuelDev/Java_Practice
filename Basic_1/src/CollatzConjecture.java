import java.util.Scanner;

//

public class CollatzConjecture {
	
	private static int number;
	private static Scanner scan;
	private static int integers;
	private static int contador;

	public static void main(String[] args){
	
		scan = new Scanner (System.in);
	 
		System.out.println("Type an integer:");
		number = scan.nextInt();
	
		integers = number;
		contador = 0;
	
		do{
			
			System.out.println(integers);
		
			if(integers % 2 == 0) {
				
				integers /= 2;
				
			}else{
				
				if(integers == 1) {
				
					break;
				
				} else {
					
					integers = integers * 3 + 1;				
				
				}
				
			}
			
			contador++;
			
		}while(integers > 0);
	
	
	}
	

}

