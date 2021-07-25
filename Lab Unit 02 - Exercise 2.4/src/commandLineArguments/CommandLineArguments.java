package commandLineArguments;

/*2.4 Write a program give example for command line arguments.
2.4.1 To find the sum of command line arguments and count the
invalid integers entered.
2.4.2 To get the name using command line. */

public class CommandLineArguments {
	
	public static void main (String [] args) {
		
		int sum = 0;
		int invalidInteger = 0;
		int size = args.length;
		
		for (int i = 0; i < size; i++) {
			
			try {
				
				System.out.print(args[i]);
				sum += Integer.parseInt(args[i]);
			
			} catch (NumberFormatException e) {
				
				invalidInteger++;
			
			}
		}
		
		System.out.println("There are " + sum + " integers within the array.");
		System.out.println("There are " + invalidInteger + " invalid integers within the array.");
		System.out.println("The size of the array is " + size);
		
	}
	

}
