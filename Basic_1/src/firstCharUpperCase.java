import java.util.*;

//Write a Java program to capitalize the first letter of each word in a sentence

 public class firstCharUpperCase {
	 
    private static Scanner scan;
	private static Scanner lineCopy;

	public static void main(String[] args){
    	 
	 scan = new Scanner(System.in);
	 
     System.out.print("Input a sentence: ");
     
	 String line = scan.nextLine();
	 
	 String lineUpperCase = ""; 
	 
       lineCopy = new Scanner(line); //this step is necessary, because strings are immutable in java
       
         while(lineCopy.hasNext()) {
        	 
              String word = lineCopy.next();//this function makes sure the next element is viewed as if it was in a new row. So it restarts the index to 0 after each word, and that allows the function charAt to identify the first char and change it to uppercase 
             
             lineUpperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; //put to uppercase and concatenate. the function substring will read the words after the first char that was just put to uppercase
             
         }
         
      System.out.println(lineUpperCase);
      
    }
     
}
