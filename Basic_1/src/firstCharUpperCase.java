import java.util.*;

//Write a Java program to capitalize the first letter of each word in a sentence.

 public class firstCharUpperCase {
	 
    private static Scanner in;
	private static Scanner lineCopy;

	public static void main(String[] args){
    	 
	 in = new Scanner(System.in);
	 
     System.out.print("Input a Sentence: ");
     
	 String line = in.nextLine();
	 
	 String lineUpperCase = ""; 
	 
       lineCopy = new Scanner(line); //this is necessary because strings are immutable in java
       
         while(lineCopy.hasNext()) {
        	 
              String word = lineCopy.next();//this function makes sure the next element is viewed as if it was in a new row. so it restarts the index to 0 after each word
             
             lineUpperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; //put to uppercase and concatenate
             
         }
         
      System.out.println(lineUpperCase);
      
    }
     
}
