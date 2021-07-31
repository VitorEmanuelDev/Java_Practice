package recursion;

/*7.3 Write a program to find the solution for the following problems using
Recursion.

7.3.1 Find the maximum of an array. Let a[] be an array of integers. if n= 1,
a[0] is the only number in the array and so, maximum = a[0]. if n > 1 ,
then do the following: find the maximum of n-1 entries of the array.
Compare this maximum with the last entry a[n-1] and finalize.

7.3.2 Find the Fibonacci numbers are defined as F 0 =1,F 1 =1 and F i =F i-1 +F i-2
for i >2.*/

public class Main {
	
	public static void main (String arg [ ]){
		
		 Fibonacci fib = new Fibonacci();
		 
		 long lg = fib.fibonacci(10);
		 
		 System.out.println(lg);
		  
		 int array[] = {5, 8, 85, 4, 50, 189, 20, 36}; 
		 int n = array.length; 
		 
		 System.out.println(maxArray(array, n));
		 
	 }

	public static int maxArray(int array[], int n){ 

		if(n == 1) {
		
			return array[0]; 
		  
		}else {
			  
			return Math.max(array[n - 1], maxArray(array, n - 1)); 
		
		}
	} 
	
}
