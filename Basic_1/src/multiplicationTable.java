import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args){
		  
		  Scanner scan = new Scanner (System.in);
	    
		  System.out.print("Which table do you want to see?\n");
		  int num = scan.nextInt();
		  int result;
		  
		  for(int i = 1; i <= 10; i++){
			  
			  result = num * i;
			  System.out.println(num + " x " + i + " = " + result);
			  
		  }
		  
		  scan.close(); 
	    
	  }
	
}
