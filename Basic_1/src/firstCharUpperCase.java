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
	 
       lineCopy = new Scanner(line); 
       
         while(lineCopy.hasNext()) {
        	 
              String word = lineCopy.next(); 
             
             lineUpperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
             
         }
         
      System.out.println(lineUpperCase);
      
    }
     
}
