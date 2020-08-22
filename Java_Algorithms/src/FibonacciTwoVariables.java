
class FibonacciTwoVariables{
	
	public static void main (String[] args){
		
		int variable1 = 0,variable2 = 1;
		
		for(int i = 0; i < 20; i++){
	
		    System.out.println(variable1);
		    System.out.println(variable2);
		    
		    variable1 = variable1 + variable2;
		    variable2 = variable1 + variable2;
		    
		}
		
	}
	
}