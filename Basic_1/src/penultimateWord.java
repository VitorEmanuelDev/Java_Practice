import java.util.*;

//Write a Java program to find the penultimate (next to last) word of a sentence.

 public class penultimateWord {
	 
     private static Scanner in;

	public static void main(String[] args){
    	 
     in = new Scanner(System.in);
     
     System.out.print("Write a sentence: ");
     
	 String str = in.nextLine();
	 
	 String[] arrStr = str.split(" ");
	 
	 System.out.println("Penultimate word: " + arrStr[arrStr.length - 2]);
	 
	 }			
	
}